package com.moon.account.repository;

import com.moon.account.domain.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @program: ams
 * @author: Mr.Xu
 * @create: 2019-04-04 16:59
 * @description: 账号数据库连接仓储接口
 */
public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {

    Optional<AccountEntity> findByUsername(String username);
}
