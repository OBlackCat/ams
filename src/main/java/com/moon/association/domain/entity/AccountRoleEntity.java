package com.moon.association.domain.entity;

import com.moon.common.domain.entity.BasicEntity;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:08
 * @description: 账号和用户的关联实体
 */
public class AccountRoleEntity extends BasicEntity {

    private Integer id;

    private Integer accountId;

    private Integer roleId;
}
