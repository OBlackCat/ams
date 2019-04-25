package com.moon.ams.role.repositroy;

import com.moon.ams.role.domain.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:13
 * @description: 角色的 DAO 类
 */
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
}
