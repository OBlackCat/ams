package com.moon.common.tools.page;

import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author: Mr.Xu
 * @create: 2019-04-20 23:56
 * @description: 分页参数
 */
@Data
public class PageParam {

    public static final int PAGE_SIZE = 10;

    /** 当前页 */
    private Integer p = 0;

    /** 每页容量 */
    private Integer c;

    /** 排序 ASC / DESC */
    @NotNull(message = "PAGE_PARAM_01")
    private DirectionEnum direction;

    /** 参与排序的参数，多个参数，中间用 ","(逗号) 隔开 */
    @NotBlank(message = "PAGE_PARAM_02")
    private String properties;

    public PageParam() {
        this.c = PAGE_SIZE;
    }

    public PageParam(Integer p, Integer c) {
        this.setP(p);
        this.setC(c);
    }

    public int firstResult() {
        return p * c;
    }

    public Integer getP() {
        return p;
    }

    public void setP(Integer p) {
        if (p != null && p > 0) {
            //hibernate分页从第0页开始
            this.p = p - 1;
        }
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        if (c != null) {
            this.c = c;
        }
    }

    public Pageable toPageable(){
        return PageRequest.of(
                this.getP(),
                this.getC(),
                direction.getDirection(),
                this.properties.split(","));
    }
}
