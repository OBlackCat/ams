package com.moon.teacher.domain.entity;

import com.moon.common.domain.entity.BasicEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:54
 * @description: 教师数据实体
 */
@Data
@Entity
@Table(name = "teacher")
public class TeacherEntity extends BasicEntity {

    /** 教师实体的唯一标识ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 教师姓名 */
    @Column(nullable = false, length = 30)
    private String name;
}
