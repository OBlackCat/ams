package com.moon.ams.classroom.repository;

import com.moon.ams.classroom.domain.entity.ClassroomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-25 15:13
 * @description: 教学场地 DAO
 */
public interface ClassroomRepository extends JpaRepository<ClassroomEntity, Integer> {
}
