package com.moon.ams.association.service;

import com.moon.ams.association.domain.entity.RoleMenuEntity;

import java.util.List;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 15:30
 * @description: 角色权限关联表的功能接口
 */
public interface RoleMenuService {

    void updateRoleMenu(Integer roleId, List<Integer> menus);

    List<RoleMenuEntity> findByRoleId(Integer roleId);
}
