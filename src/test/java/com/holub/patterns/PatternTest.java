package com.holub.patterns;

import com.holub.tools.ExceptionMessages;
import com.holub.utils.PointUtils;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PatternTest {

    final int width = 1000;
    final int height = 1000;
    final int gridSize = 8;
    Rectangle bounds = new Rectangle(0, 0, width, height);
    int pixelsPerCell = bounds.width / gridSize / gridSize;

    @Test
    void 디폴트_패턴_클릭한_위치만_포인트_생성() {
        //given
        Pattern pattern = new DefaultPattern();
        Point startPoint = PointUtils.createPoint(1, 1, pixelsPerCell);

        //when
        List<Point> result = pattern.getPoints(bounds, startPoint, pixelsPerCell);

        //then
        assertThat(result).containsExactlyInAnyOrder(startPoint);
    }

    @Test
    void Plus_패턴_정상_테스트() {
        //given
        Pattern pattern = new PlusPattern();
        Point startPoint = PointUtils.createPoint(1, 1, pixelsPerCell);
        //when
        List<Point> result = pattern.getPoints(bounds, startPoint, pixelsPerCell);
        //then
        assertThat(result).containsExactlyInAnyOrder(
                PointUtils.createPoint(1, 1, pixelsPerCell),
                PointUtils.createPoint(1, 2, pixelsPerCell),
                PointUtils.createPoint(1, 3, pixelsPerCell),
                PointUtils.createPoint(0, 2, pixelsPerCell),
                PointUtils.createPoint(2, 2, pixelsPerCell)
        );
    }

    @Test
    void Line_패턴_정상_테스트() {
        //given
        Pattern pattern = new LinePattern();
        Point startPoint = PointUtils.createPoint(0, 0, pixelsPerCell);
        //when
        List<Point> result = pattern.getPoints(bounds, startPoint, pixelsPerCell);
        //then
        assertThat(result).containsExactlyInAnyOrder(
                PointUtils.createPoint(0, 1, pixelsPerCell),
                PointUtils.createPoint(0, 2, pixelsPerCell),
                PointUtils.createPoint(0, 3, pixelsPerCell),
                PointUtils.createPoint(0, 0, pixelsPerCell)
        );
    }

    @Test
    void L_패턴_정상_테스트() {
        //given
        Pattern pattern = new LPattern();
        Point startPoint = PointUtils.createPoint(0, 0, pixelsPerCell);
        //when
        List<Point> result = pattern.getPoints(bounds, startPoint, pixelsPerCell);
        //then
        assertThat(result).containsExactlyInAnyOrder(
                PointUtils.createPoint(0, 1, pixelsPerCell),
                PointUtils.createPoint(0, 2, pixelsPerCell),
                PointUtils.createPoint(0, 3, pixelsPerCell),
                PointUtils.createPoint(1, 3, pixelsPerCell),
                PointUtils.createPoint(0, 0, pixelsPerCell)
        );
    }

    @Test
    void Plus_패턴_범위_밖_테스트() {
        //given
        Pattern pattern = new PlusPattern();
        Point startPoint = PointUtils.createPoint(0, 0, pixelsPerCell);
        //when, then
        assertThatThrownBy(() -> pattern.getPoints(bounds, startPoint, pixelsPerCell))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessages.INVALID_POINT);
    }

    @Test
    void Line_패턴_범위_밖_테스트() {
        //given
        Pattern pattern = new LinePattern();
        Point startPoint = PointUtils.createPoint(64, 64, pixelsPerCell);
        //when, then
        assertThatThrownBy(() -> pattern.getPoints(bounds, startPoint, pixelsPerCell))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessages.INVALID_POINT);
    }

    @Test
    void L_패턴_범위_밖_테스트() {
        //given
        Pattern pattern = new LPattern();
        Point startPoint = PointUtils.createPoint(64, 64, pixelsPerCell);
        //when, then
        assertThatThrownBy(() -> pattern.getPoints(bounds, startPoint, pixelsPerCell))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ExceptionMessages.INVALID_POINT);
    }
}
