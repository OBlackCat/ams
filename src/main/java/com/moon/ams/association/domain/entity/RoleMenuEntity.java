package com.moon.ams.association.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 15:26
 * @description: 角色和权限的关联表
 */
@Data
@Entity
@Table(name = "a_role_permission")
public class RoleMenuEntity {

    /**
     * 【唯一标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 【角色唯一标识ID】
     */
    @Column(nullable = false)
    private Integer roleId;

    /**
     * 【权限唯一标识ID】
     */
    private Integer menuId;

    public RoleMenuEntity(Integer roleId, Integer menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }
}
