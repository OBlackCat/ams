package com.moon.ams.association.repository;

import com.moon.ams.association.domain.entity.RoleMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 15:29
 * @description: 角色权限关联表的 DAO
 */
public interface RoleMenuRepository extends JpaRepository<RoleMenuEntity, Integer> {

    List<RoleMenuEntity> findByRoleId(Integer roleId);
}
