package com.holub.utils;

import java.awt.*;

public class PointUtils {
    // 상대 좌표로 실제 마우스 좌표 생성
    public static Point createPoint(int x, int y, int pixelsPerCell) {
        return new Point(x * pixelsPerCell, y * pixelsPerCell);
    }
}
