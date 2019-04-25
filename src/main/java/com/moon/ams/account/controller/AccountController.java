package com.moon.ams.account.controller;

import com.moon.ams.account.domain.dto.AccountsConditionDTO;
import com.moon.ams.account.domain.dto.CreateAccountDTO;
import com.moon.ams.account.domain.dto.LoginDTO;
import com.moon.ams.account.domain.entity.AccountEntity;
import com.moon.ams.account.domain.vo.LoginVO;
import com.moon.ams.account.service.AccountService;
import com.moon.common.tools.page.PageParam;
import com.moon.common.tools.page.PageResult;
import com.moon.common.tools.result.ApiResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 16:39
 * @description: 账户服务入口
 */
@RestController
@RequestMapping(value = "/accounts")
public class AccountController {

    @Resource
    AccountService accountService;

    /**
     * @No.: AMS_ACCOUNT_01
     * @auther: Mr.Xu
     * @date: 2019-04-04 16:53
     * @param: [loginDTO dto]
     * @return: ApiResult
     * @description: 登录接口
     */
    @PostMapping(value = "/login")
    public ApiResult login(@RequestBody LoginDTO dto) {
        LoginVO loginVO = accountService.login(dto);
        return ApiResult.success(loginVO);
    }

    /**
     * @No.: AMS_ACCOUNT_02
     * @auther: Mr.Xu
     * @date: 2019-04-20 23:19
     * @param: [CreateAccountDTO dto]
     * @return: ApiResult
     * @description: 新增账号
     */
    @PostMapping
    public ApiResult createAccount(@RequestBody CreateAccountDTO dto) {
        accountService.createAccount(dto);
        return ApiResult.success();
    }

    /**
     * @No.: AMS_ACCOUNT_03
     * @auther: Mr.Xu
     * @date: 2019-04-20 23:22
     * @param: [Integer id]
     * @return: ApiResult
     * @description: 根据 id 删除账号
     */
    @DeleteMapping(value = "/{id}")
    public ApiResult deleteAccount(@PathVariable Integer id) {
        accountService.deleteAccount(id);
        return ApiResult.success();
    }

    /**
     * @No.: AMS_ACCOUNT_04
     * @auther: Mr.Xu
     * @date: 2019-04-20 23:24
     * @param: [String username]
     * @return: ApiResult
     * @description: 根据账号查询
     */
    @GetMapping(value = "/username/{username}")
    public ApiResult getAccountByUsername(@PathVariable String username) {
        AccountEntity account = accountService.getAccountByUsername(username);
        return ApiResult.success(account);
    }


    /**
     * @No.: AMS_ACCOUNT_05
     * @auther: Mr.Xu
     * @date: 2019-04-20 23:55
     * @param:
     * @return:
     * @description:
     */
    @GetMapping
    public ApiResult getAccounts(AccountsConditionDTO dto, PageParam pageParam) {
        PageResult result = accountService.getAccounts(dto, pageParam);
        return ApiResult.success(result);
    }
}
