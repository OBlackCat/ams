package com.moon.ams.user.student.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:54
 * @description: 学生实体
 */
@Data
@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {

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
     *【唯一标识】 关联的班级的唯一标识
     */
    @Column(nullable = false)
    private Integer clazzId;

    /**
     * 【学生姓名】
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
