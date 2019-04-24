package com.moon.common.tools.page;

import org.springframework.data.domain.Sort.Direction;

/**
 * @auther: Mr.Xu
 * @date: 2019-04-24 14:37
 * @description: Sort.Direction
 */
public enum DirectionEnum {

    ASC (Direction.ASC),
    DESC (Direction.DESC);

    private Direction direction;

    DirectionEnum(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
