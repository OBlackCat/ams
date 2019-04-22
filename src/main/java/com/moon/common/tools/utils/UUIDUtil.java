package com.moon.common.tools.utils;

import java.util.UUID;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 17:21
 * @description: UUID工具类
 */
public class UUIDUtil {

    public static String random() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }
}
