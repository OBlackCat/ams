package com.moon.association.domain.entity;

import com.moon.common.domain.entity.BasicEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:08
 * @description: 账号和用户的关联实体
 */
@Data
@Entity
@Table(name = "account_role")
public class AccountRoleEntity extends BasicEntity {

    /** 唯一标识ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 关联的账号唯一标识ID */
    private Integer accountId;

    /** 关联的角色唯一标识ID */
    private Integer roleId;
}
