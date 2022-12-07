package com.holub.patterns;

import com.holub.life.Position;

import java.util.List;

// + 모양 패턴
public class PlusPattern extends Pattern {

    List<Position> positions = List.of(
            new Position(0, 0),
            new Position(0, 1),
            new Position(-1, 1),
            new Position(0, 2),
            new Position(1, 1)
    );

    @Override
    protected List<Position> getPositions() {
        return positions;
    }

    @Override
    protected Position leftUpperMost() {
        return new Position(-1, 0);
    }

    @Override
    protected Position rightLowerMost() {
        return new Position(1, 2);
    }
}
