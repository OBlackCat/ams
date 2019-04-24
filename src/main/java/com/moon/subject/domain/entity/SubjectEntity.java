package com.moon.subject.domain.entity;

import com.moon.common.domain.entity.BasicEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:54
 * @description: 课程实体
 */
@Data
public class SubjectEntity extends BasicEntity {


    /** 课程实体的唯一标识ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 课程名 */
    @Column(nullable = false, length = 50)
    private String name;

}