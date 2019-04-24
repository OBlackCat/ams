package com.moon.role.controller;

import com.moon.common.tools.result.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:03
 * @description: 角色功能
 */
@RestController
@RequestMapping(value = "/roles")
public class RoleController {


    @GetMapping
    public ApiResult getAllRoles() {
        return ApiResult.success();
    }
}
