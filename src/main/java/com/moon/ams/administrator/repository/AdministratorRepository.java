package com.moon.ams.administrator.repository;

import com.moon.ams.administrator.domain.entity.AdministratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 14:29
 * @description: 管理员数据 DAO
 */
public interface AdministratorRepository extends JpaRepository<AdministratorEntity, Integer> {
}
