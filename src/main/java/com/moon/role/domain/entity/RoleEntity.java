package com.moon.role.domain.entity;

import com.moon.common.domain.entity.BasicEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:07
 * @description: 角色实体
 */
@Data
@Entity
@Table(name = "role")
public class RoleEntity extends BasicEntity {

    /** 角色ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 角色名 */
    @Column(nullable = false, length = 30)
    private String name;

}
