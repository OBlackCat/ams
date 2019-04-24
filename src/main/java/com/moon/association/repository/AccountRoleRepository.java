package com.moon.association.repository;

import com.moon.association.domain.entity.AccountRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:26
 * @description: 账号和用户关联实体的 DAO
 */
public interface AccountRoleRepository extends JpaRepository<AccountRoleEntity, Integer> {
}
