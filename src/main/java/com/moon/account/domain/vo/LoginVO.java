package com.moon.account.domain.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 16:44
 * @description: 登录操作返回体
 */
@Data
@Builder
public class LoginVO {

    /**
     * accessToken 失效时间
     */
    private Long expireIn;

    /**
     * 验证的 token，超过失效时间，必须重新登录
     */
    private String accessToken;

}
