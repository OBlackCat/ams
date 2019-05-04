package com.moon.ams.attendance.domain.dto;

import lombok.Data;

import javax.persistence.Column;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 23:41
 * @description: 获取学生考勤
 */
@Data
public class AttendanceConditionDTO {


    private Integer teacherId;

    /**
     * 【课程时间唯一标识ID】
     */
    private Integer scheduleId;


    /**
     * 【班级唯一标识ID】
     */
    private Integer clazzId;

    /**
     * 【科目唯一标识ID】
     */
    private Integer subjectId;
}