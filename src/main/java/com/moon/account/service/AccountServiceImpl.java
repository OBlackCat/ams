package com.moon.account.service;

import com.moon.account.domain.dto.CreateAccountDTO;
import com.moon.account.domain.dto.LoginDTO;
import com.moon.account.domain.entity.AccountEntity;
import com.moon.account.domain.enums.LoginTypeEnum;
import com.moon.account.domain.vo.LoginVO;
import com.moon.account.repository.AccountRepository;
import com.moon.common.service.RedisService;
import com.moon.common.tools.exception.CustomException;
import com.moon.common.tools.exception.ExceptionManager;
import com.moon.common.tools.utils.MapperUtils;
import com.moon.common.tools.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 16:48
 * @description: 账号服务接口的实现类
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final String REDIS_KEY_PREFIX = "account:";

    /** accessToken 的失效时间。单位：毫秒 */
    private static final long EXPIRE_IN = 1000 * 60 * 30;

    @Resource
    RedisService redisService;
    @Resource
    ExceptionManager exceptionManager;
    @Resource
    AccountRepository accountRepository;

    /**
     * 用户登录
     */
    @Override
    public LoginVO login(@Valid LoginDTO loginDTO) {

        AccountEntity account = this.getAccountByUsername(loginDTO.getUsername());

        if (!Objects.equals( account.getPassword(), loginDTO.getPassword())) {
            throw exceptionManager.create("ACCOUNT_LOGIN_02");  //密码错误，请联系管理员重置密码
        }

        if (LoginTypeEnum.FORCED.equals(loginDTO.getLoginType())) {
            //强制登录，删除 Redis 中关联的数据
            String oldAccessToken = (String) redisService.delete(loginDTO.getUsername());
            redisService.delete(oldAccessToken);
        }

        Object obj = redisService.get(REDIS_KEY_PREFIX + account.getUsername());
        if (obj != null) {
            throw exceptionManager.create("ACCOUNT_LOGIN_03");
        }

        //生成accessToken
        String accessToken = UUIDUtil.random();

        //存储在redis中，登录时使用， key为 'account:账号'
        redisService.set(REDIS_KEY_PREFIX + account.getUsername(), accessToken, EXPIRE_IN);
        //登录后调用接口时使用， key 为 accessToken， value 为 关联的账号信息 - account 对象
        redisService.set(accessToken, account, EXPIRE_IN);

        return LoginVO.builder().accessToken(accessToken).expireIn(EXPIRE_IN).build();
    }

    /**
     * 新增账号
     * @param dto
     */
    @Override
    public void createAccount(@Valid CreateAccountDTO dto) {

        Optional<AccountEntity> optional = accountRepository.findByUsername(dto.getUsername());

        if (optional.isPresent()) {
            throw exceptionManager.create("ACCOUNT_LOGIN_04");
        }

        AccountEntity account = MapperUtils.mapperBean(dto, AccountEntity.class);
        accountRepository.save(account);
    }

    /**
     * 根据 id 删除账号
     * @param id
     */
    @Override
    public void deleteAccount(Integer id) {
        Optional<AccountEntity> optional = accountRepository.findById(id);
        AccountEntity account = optional.orElseThrow(() -> exceptionManager.create("ACCOUNT_LOGIN_01"));
        accountRepository.delete(account);
    }

    /**
     * 根据账号查询账号数据
     * @param username
     * @return
     */
    @Override
    public AccountEntity getAccountByUsername(String username) {
        Optional<AccountEntity> optional = accountRepository.findByUsername(username);
        AccountEntity account = optional.orElseThrow(() -> exceptionManager.create("ACCOUNT_LOGIN_01"));//账号不存在，请跟管理员确认
        return account;
    }
}
