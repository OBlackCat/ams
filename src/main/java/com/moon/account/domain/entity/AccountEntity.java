package com.moon.account.domain.entity;

import com.moon.common.domain.entity.BasicEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 13:48
 * @description: 账号实体类， 用户的登录，权限验证等
 */
@Data
@Entity
@Table(name = "account")
public class AccountEntity extends BasicEntity implements Serializable {

    /**
     * 【账号ID】 当前类对应的账号表中的唯一标识，对应账号表中的主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 【用户账号】 一旦创建，不可更新
     */
    @Column(length = 20, nullable = false, updatable = false)
    private String username;

    /**
     * 【用户密码】 不存储明文密码，存储MD5值
     */
    @Column(length = 32, nullable = false)
    private String password;

    public AccountEntity() {
        super.initGmt();
    }
}
