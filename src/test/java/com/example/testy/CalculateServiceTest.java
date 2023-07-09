package com.example.testy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateServiceTest {

    private final CalculateService calculateService = (CalculateService) new CalculateServiceImpl();


    @Test
    public void shouldReturnResult9WithPlus6and3() {
        int result = calculateService.plus(6, 3);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void shouldReturnResult3WithMinus6and3() {
        int result = calculateService.minus(6, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReturnResult4WithMultiplay2and2() {
        int result = calculateService.multiplay(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldReturnResult2WithDevide6and3() {
        int result = calculateService.devide(6, 3);
        Assertions.assertEquals(2, result);
    }


}

