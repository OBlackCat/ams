package com.moon.ams.permission.repositroy;

import com.moon.ams.permission.domain.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:20
 * @description: 权限 DAO
 */
public interface PermissionRepository extends JpaRepository<PermissionEntity, Integer> {
}