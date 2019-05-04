package com.moon.ams.attendance.service;

import com.moon.ams.attendance.domain.entity.AttendanceEntity;

import java.util.List;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 23:36
 * @description: 考勤功能接口
 */
public interface AttendanceService {

    List<AttendanceEntity> findByCondition(ConditionDTO dto);

}
