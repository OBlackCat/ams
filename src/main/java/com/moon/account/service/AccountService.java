package com.moon.account.service;

import com.moon.account.domain.dto.AccountsConditionDTO;
import com.moon.account.domain.dto.CreateAccountDTO;
import com.moon.account.domain.dto.LoginDTO;
import com.moon.account.domain.entity.AccountEntity;
import com.moon.account.domain.vo.LoginVO;
import com.moon.common.tools.page.PageParam;
import com.moon.common.tools.page.PageResult;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 16:43
 * @description: 账号服务接口
 */
@Validated
public interface AccountService {

    /**
     * 用户登录
     * @param loginDTO
     * @return LoginVO
     */
    LoginVO login(@Valid LoginDTO loginDTO);

    /**
     * 新增账号
     * @param dto
     */
    void createAccount(@Valid CreateAccountDTO dto);

    /**
     * 根据 id 删除账号
     * @param id
     */
    void deleteAccount(@NotNull(message = "ACCOUNT_LOGIN_DTO_05") Integer id);

    /**
     * 根据账号查询
     * @param username
     * @return
     */
    AccountEntity getAccountByUsername(@NotNull(message = "ACCOUNT_LOGIN_DTO_06") String username);

    /**
     * 根据查询条件获取列表
     * @param dto
     * @param pageParam
     * @return
     */
    PageResult getAccounts(AccountsConditionDTO dto, PageParam pageParam);
}
