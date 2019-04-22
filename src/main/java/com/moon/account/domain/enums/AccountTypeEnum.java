package com.moon.account.domain.enums;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 14:17
 * @description: 用户类型枚举，包含 学生，老师，管理员
 */
public enum AccountTypeEnum {

    ADMINISTRATOR("管理员"),
    STUDENT("学生"),
    TEACHER("教师");

    private String value;

    AccountTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
