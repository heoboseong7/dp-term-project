package com.holub.patterns;

import com.holub.life.Position;

import java.util.List;

public class LPattern extends Pattern {

    List<Position> positions = List.of(
            new Position(0, 0),
            new Position(0, 1),
            new Position(0, 2),
            new Position(0, 3),
            new Position(1, 3)
    );

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
        return new Position(1, 3);
    }
}
