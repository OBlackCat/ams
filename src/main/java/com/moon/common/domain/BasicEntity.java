package com.moon.common.domain;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDateTime;

/**
 * @author: Mr.Xu
 * @create: 2019-04-20 23:05
 * @description: 所有实体的公共父类
 */
@Data
public class BasicEntity {

    /**
     * 【创建时间】 数据创建时间，创建后不再更新
     */
    @Column(nullable = false, updatable = false)
    private LocalDateTime gmtCreate;

    /**
     * 【更新时间】 数据更新时间
     */
    @Column(nullable = false)
    private LocalDateTime gmtUpdate;

    public void initGmt() {
        this.gmtCreate = LocalDateTime.now();
        this.gmtUpdate = LocalDateTime.now();
    }
}
