package com.holub.patterns;

import com.holub.life.Position;
import com.holub.tools.ExceptionMessages;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 탬플릿 메서드 패턴 적용
 */
public abstract class Pattern {
    protected abstract List<Position> getPositions();
    protected abstract Position leftUpperMost();
    protected abstract Position rightLowerMost();

    public final List<Point> getPoints(Rectangle bound, Point startPoint, int pixelsPerCell) {
        // 유효하지 않으면 예외 발생
        if(!isValid(bound, startPoint, pixelsPerCell)) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_POINT);
        }

        return getPositions().stream()
                .map(position -> new Point(startPoint.x + position.x * pixelsPerCell, startPoint.y + position.y * pixelsPerCell))
                .collect(Collectors.toList());
    }

    // 해당 패턴이 들어가는 직사각형의 왼쪽 상단과 우측 하단의 좌표를 통해 가능한지 검사
    private boolean isValid(Rectangle bound, Point startPoint, int pixelsPerCell) {
        return startPoint.x + leftUpperMost().x * pixelsPerCell >= 0
                && startPoint.y + leftUpperMost().y * pixelsPerCell >= 0
                && startPoint.x + rightLowerMost().x * pixelsPerCell <= bound.width
                && startPoint.y + rightLowerMost().y * pixelsPerCell <= bound.height;
    }
}
