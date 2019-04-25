package com.moon.ams.schedule.domain.enums;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 17:30
 * @description:
 */
public enum  ScheduleEnum {

    SCHEDULE_MAP (null);

    private Map<Integer, LocalDateTime[]> scheduleMap;

    ScheduleEnum(Map<Integer, LocalDateTime[]> scheduleMap) {
        this.scheduleMap = scheduleMap;
    }
}
