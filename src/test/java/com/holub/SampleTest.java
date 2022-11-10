package com.holub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    @DisplayName("테스트의 테스트")
    void test() {
        Assertions.assertEquals(2, 1+1);
    }
}
