package com.moon.ams.student.repositroy;

import com.moon.ams.student.domain.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 18:01
 * @description: 学生数据的仓储
 */
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
