package com.moon.ams.schedule.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 16:47
 * @description: 课时表
 */
@Data
@Entity
@Table(name = "schedule")
public class ScheduleEntity implements Serializable {

    /**
     * 【唯一标识ID】
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 【课时名称】 如:上午第一节，上午第二节
     */
    @Column(nullable = false, length = 30)
    private String name;

    /**
     * 【上课时间】
     */
    @Column(nullable = false)
    private LocalDateTime gmtStart;

    /**
     * 【下课时间】
     */
    @Column(nullable = false)
    private LocalDateTime gmtEnd;

    /**
     * 【创建时间】 数据创建时间，创建后不再更新
     */
    @Column(nullable = false, updatable = false)
    private LocalDateTime gmtCreate;

    /**
     * 【更新时间】 数据更新时间，新增时该数据为空
     */
    @Column(insertable = false)
    private LocalDateTime gmtUpdate;

}
