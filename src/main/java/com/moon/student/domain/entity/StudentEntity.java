package com.moon.student.domain.entity;

import com.moon.common.domain.entity.BasicEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:54
 * @description: 学生实体
 */
@Data
@Entity
@Table(name = "student")
public class StudentEntity extends BasicEntity {

    /** 学生实体的唯一标识ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 学生姓名 */
    @Column(nullable = false, length = 30)
    private String name;

    /** 班级的唯一标识 */
    @Column(nullable = false)
    private Integer clazzId;
}
