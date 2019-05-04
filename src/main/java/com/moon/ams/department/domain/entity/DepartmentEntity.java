package com.moon.ams.department.domain.entity;

import com.moon.ams.department.domain.enums.DepartmentTypeEnum;
import lombok.Data;

import javax.persistence.*;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 15:48
 * @description: 专业系数据实体
 */
@Data
@Entity
@Table(name = "department")
public class DepartmentEntity {

    /**
     * 【唯一标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DepartmentTypeEnum departmentType;

    /**
     * 【专业系名称】
     */
    @Column(nullable = false)
    private String name;
}
