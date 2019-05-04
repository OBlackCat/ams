package com.moon.ams.menu.repositroy;

import com.moon.ams.menu.domain.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:20
 * @description: 权限 DAO
 */
public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {
}
