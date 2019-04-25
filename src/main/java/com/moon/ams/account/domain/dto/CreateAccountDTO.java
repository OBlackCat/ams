package com.moon.ams.account.domain.dto;

import com.moon.ams.account.domain.enums.AccountTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author: Mr.Xu
 * @create: 2019-04-20 22:51
 * @description: 新增账号 DTO
 */
@Data
public class CreateAccountDTO {

    /** 账号 */
    @NotBlank(message = "ACCOUNT_CREATE_01")
    @Size(min = 10, max = 12, message = "ACCOUNT_CREATE_02")
    private String username;

    /** 账号类型 */
    @NotNull(message = "ACCOUNT_CREATE_03")
    private AccountTypeEnum accountType;
}
