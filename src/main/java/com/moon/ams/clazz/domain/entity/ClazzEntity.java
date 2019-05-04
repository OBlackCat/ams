package com.moon.ams.clazz.domain.entity;

import com.moon.ams.clazz.domain.enums.GradeEnum;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:54
 * @description: 班级实体
 */
@Data
@Entity
@Table(name = "clazz")
public class ClazzEntity implements Serializable {

    /**
     * 【唯一标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 【班级号码】
     */
    @Column(nullable = false, length = 30)
    private Integer clazzNum;

    /**
     * 【关联的专业系的唯一标识ID】
     */
    @Column(nullable = false)
    private Integer departmentId;

    /**
     * 【关联的学院的唯一标识ID】
     */
    @Column(nullable = false)
    private Integer literatureId;

    /**
     * 【阶段】 级的阶段 一年级 二年级等
     */
    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private GradeEnum grade;

    /**
     * 【班级学生人数】
     */
    @Column
    private Integer studentNum;

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
