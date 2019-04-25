package com.moon.ams.clazz.domain.enums;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 17:10
 * @description: 班级的阶段 比如 一年级二年级等
 */
public enum GradeEnum {

    ONE ("一年级"),
    TWO ("二年级"),
    THREE ("三年级"),
    FOUR ("四年级");

    private String name;

    GradeEnum(String name) {
        this.name = name;
    }
}
