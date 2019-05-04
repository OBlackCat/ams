package com.moon.ams.association.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:08
 * @description: 账号和用户的关联实体
 */
@Data
@Entity
@Table(name = "a_account_role")
public class AccountRoleEntity implements Serializable {

    /**
     * 【唯一标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 【唯一标识ID】 关联的账号唯一标识ID
     */
    @Column(nullable = false)
    private Integer accountId;

    /**
     * 【唯一标识ID】 关联的角色唯一标识ID
     */
    @Column(nullable = false)
    private Integer roleId;

}
