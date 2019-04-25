package com.moon.ams.arrange.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 13:46
 * @description: 课程安排计划实体
 */
@Data
@Entity
@Table(name = "arrange")
public class ArrangeEntity implements Serializable {

    /**
     * 【标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

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
