package com.moon.ams.classroom.domain.enums;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 13:40
 * @description: 学习场地类型
 */
public enum ClassroomTypeEnum {

    INDOOR ("室内"), OUTDOOR ("室外");

    private String name;

    ClassroomTypeEnum(String name) {
        this.name = name;
    }
}
