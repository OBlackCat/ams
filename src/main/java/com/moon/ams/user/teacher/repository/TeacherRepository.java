package com.moon.ams.user.teacher.repository;

import com.moon.ams.user.teacher.domain.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:54
 * @description: 教师数据 DAO
 */
public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {
}
