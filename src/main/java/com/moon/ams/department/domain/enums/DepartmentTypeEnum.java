package com.moon.ams.department.domain.enums;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 15:53
 * @description: 院系类型
 */
public enum DepartmentTypeEnum {

    INSTITUTE("院"), DEPARTMENT ("系");

    private String value;

    DepartmentTypeEnum(String value) {
        this.value = value;
    }
}
