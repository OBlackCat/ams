package com.moon.ams.account.domain.dto;

import com.moon.ams.account.domain.enums.AccountTypeEnum;
import lombok.Data;

/**
 * @author: Mr.Xu
 * @create: 2019-04-20 23:57
 * @description: 账号列表查询条件
 */
@Data
public class AccountsConditionDTO {

    private String username;

    private AccountTypeEnum accountType;
}
