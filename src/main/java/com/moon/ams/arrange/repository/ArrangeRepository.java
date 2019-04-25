package com.moon.ams.arrange.repository;

import com.moon.ams.arrange.domain.entity.ArrangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 14:43
 * @description: 课程安排 DAO
 */
public interface ArrangeRepository extends JpaRepository<ArrangeEntity, Integer> {
}
