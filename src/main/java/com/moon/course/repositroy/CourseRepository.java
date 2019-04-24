package com.moon.course.repositroy;

import com.moon.course.domain.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 17:53
 * @description: 课程的 DAO
 */
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}
