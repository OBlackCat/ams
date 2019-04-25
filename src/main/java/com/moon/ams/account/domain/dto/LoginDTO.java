package com.moon.ams.account.domain.dto;

import com.moon.ams.account.domain.enums.LoginTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 14:53
 * @description: 用户登录DTO
 */
@Data
public class LoginDTO {

    /** 账号 */
    @NotBlank(message = "ACCOUNT_LOGIN_DTO_01")
    @Size(max = 20, message = "ACCOUNT_LOGIN_DTO_02")
    private String username;

    /** 密码 */
    @NotBlank(message = "ACCOUNT_LOGIN_DTO_03")
    private String password;

    /** 登录类型 */
    @NotBlank(message = "ACCOUNT_LOGIN_DTO_04")
    private LoginTypeEnum loginType;
}
