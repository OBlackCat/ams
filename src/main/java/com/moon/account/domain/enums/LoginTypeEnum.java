package com.moon.account.domain.enums;

/**
 * @author: Mr.Xu
 * @create: 2019-04-20 22:11
 * @description: 强制登录状态
 */
public enum LoginTypeEnum {

    FORCED ("强制登录"),
    NORMAL ("正常登录");

    private String name;

    LoginTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
