package com.moon.permission.domain.entity;

import lombok.Data;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:17
 * @description: 权限实体
 */
@Data
public class PermissionEntity {

    /** 权限的唯一标识ID */
    private Integer id;

    /** 权限名 */
    private String name;
}
