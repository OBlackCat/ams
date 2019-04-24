package com.moon.permission.domain.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:17
 * @description: 权限实体
 */
@Data
@Entity
@Table(name = "permission")
public class PermissionEntity {

    /** 权限的唯一标识ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 权限名 */
    @Column(nullable = false, length = 30)
    private String name;
}
