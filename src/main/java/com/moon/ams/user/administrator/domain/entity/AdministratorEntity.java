package com.moon.ams.user.administrator.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 14:30
 * @description: 管理员实体
 */
@Data
@Entity
@Table(name = "administrator")
public class AdministratorEntity {

    /**
     * 【唯一标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 【唯一标识】 关联的账号表唯一标识
     */
    private Integer accountId;

    /**
     * 【管理员姓名】
     */
    @Column(nullable = false, length = 30)
    private String name;

    /**
     * 【创建时间】 数据创建时间，创建后不再更新
     */
    @Column(nullable = false, updatable = false)
    private LocalDateTime gmtCreate;

    /**
     * 【更新时间】 数据更新时间，新增时该数据为空
     */
    @Column(insertable = false)
    private LocalDateTime gmtUpdate;
}
