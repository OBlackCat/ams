package com.moon.ams.clazz.repositroy;

import com.moon.ams.clazz.domain.entity.ClazzEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 17:24
 * @description: 班级的 DAO
 */
public interface ClazzRepository extends JpaRepository<ClazzEntity, Integer> {
}
