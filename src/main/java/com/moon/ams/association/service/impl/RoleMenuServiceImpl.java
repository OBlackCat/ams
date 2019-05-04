package com.moon.ams.association.service.impl;

import com.moon.ams.association.domain.entity.RoleMenuEntity;
import com.moon.ams.association.repository.RoleMenuRepository;
import com.moon.ams.association.service.RoleMenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 15:29
 * @description: 角色权限关联功能具体实现
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

    @Resource
    RoleMenuRepository repository;

    /**
     * 根据角色ID更新菜单
     * @param roleId
     * @param menus
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateRoleMenu(Integer roleId, List<Integer> menus) {
        List<RoleMenuEntity> list = repository.findByRoleId(roleId);
        if (list != null && list.size() > 0) {
            repository.deleteAll(list);
        }

        List<RoleMenuEntity> newList = menus.stream().map(m -> new RoleMenuEntity(roleId, m)).collect(Collectors.toList());
        repository.saveAll(newList);
    }

    /**
     * 根据角色ID查询菜单
     * @param roleId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<RoleMenuEntity> findByRoleId(Integer roleId) {
        List<RoleMenuEntity> menus = repository.findByRoleId(roleId);
        return menus;
    }

}
