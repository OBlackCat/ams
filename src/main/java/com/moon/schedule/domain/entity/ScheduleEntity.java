package com.moon.schedule.domain.entity;

import com.moon.common.domain.entity.BasicEntity;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:47
 * @description: 课程时间表
 */
@Data
@Entity
@Table(name = "schedule")
public class ScheduleEntity extends BasicEntity {

    /** 课程表唯一标识ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** 课程名称：如:上午第一节，上午第二节 */
    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private LocalDateTime endTime;

}
