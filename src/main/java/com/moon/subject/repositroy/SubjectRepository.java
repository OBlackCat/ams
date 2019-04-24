package com.moon.subject.repositroy;

import com.moon.subject.domain.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 17:53
 * @description: 课程的 DAO
 */
public interface SubjectRepository extends JpaRepository<SubjectEntity, Integer> {
}
