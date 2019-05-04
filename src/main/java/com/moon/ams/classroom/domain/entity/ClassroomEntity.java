package com.moon.ams.classroom.domain.entity;

import com.moon.ams.classroom.domain.enums.ClassroomTypeEnum;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 13:27
 * @description: 教室数据实体
 */
@Data
@Entity
@Table(name = "classroom")
public class ClassroomEntity {

    /**
     * 【唯一标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 【校区编号】
     */
    @Column
    private Integer campusNum;

    /**
     * 【校区名】
     */
    @Column(length = 30)
    private String campusName;

    /**
     * 【教学楼编号】
     */
    @Column
    private Integer buildingNum;

    /**
     * 【教学楼名称】
     */
    @Column(length = 30)
    private String buildingName;

    /**
     * 【楼层】
     */
    @Column
    private Integer floorNum;

    /**
     * 【教室门牌号】
     */
    @Column
    private Integer roomNum;

    /**
     * 【可容纳人数】
     */
    @Column(nullable = false)
    private Integer capacity;

    /**
     * 【场地类型】 室内 / 室外
     */
    @Column(nullable = false)
    private ClassroomTypeEnum classroomType;


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
