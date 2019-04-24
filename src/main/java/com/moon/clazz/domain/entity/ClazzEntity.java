package com.moon.clazz.domain.entity;

import com.moon.clazz.domain.enums.GradeEnum;
import com.moon.common.domain.entity.BasicEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:54
 * @description: 班级实体
 */
@Data
@Entity
@Table(name = "clazz")
public class ClazzEntity extends BasicEntity {

    /** 班级ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 班级名称 */
    @Column(nullable = false, length = 30)
    private String name;

    /** 班级的阶段 一年级 二年级等 */
    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private GradeEnum grade;

}
