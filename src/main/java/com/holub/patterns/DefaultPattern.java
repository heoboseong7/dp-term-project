package com.holub.patterns;

import com.holub.life.Position;

import java.util.List;

// 기본(누른 칸만) 패턴
public class DefaultPattern extends Pattern {

    List<Position> positions = List.of(new Position(0, 0));

    @Override
    protected List<Position> getPositions() {
        return positions;
    }

    @Override
    protected Position leftUpperMost() {
        return new Position(0, 0);
    }

    @Override
    protected Position rightLowerMost() {
        return new Position(0, 0);
    }
}
