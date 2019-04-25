package com.moon.ams.attendance.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 14:46
 * @description: 学生考勤实体
 * 若 gmtClockIn 和 gmtClockOut 都为空，记为旷课
 */
@Data
@Entity
@Table(name = "attendance")
public class AttendanceEntity {

    /**
     * 【唯一标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 【学生唯一标识ID】 关联的学生表的唯一标识
     */
    @Column(nullable = false)
    private Integer studentId;

    /**
     * 【课程唯一标识ID】 关联的课程表的唯一标识
     */
    @Column(nullable = false)
    private Integer arrangeId;

    /**
     * 【上课打卡时间】 可为空，为空则为未打卡，记为迟到
     */
    @Column
    private LocalDateTime gmtClockIn;

    /**
     * 【下课打卡时间】 可为空，为空则为未打卡，记为早退，
     */
    @Column
    private LocalDateTime gmtClockOut;

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
