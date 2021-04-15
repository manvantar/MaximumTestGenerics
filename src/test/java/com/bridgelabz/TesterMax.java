package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesterMax {
    private static  Maximum maximumTest = new Maximum();

    @Test
    public void given3Num_and_when_firstNumberIsMax_ShouldReturn_true() {
        Float[] floatArray = {10.12f, 8.21f, 2.12f};
        Float result = maximumTest.findMaximum(floatArray);
        Assertions.assertEquals(Float.valueOf(10.12f), result);
    }

    @Test
    public void given3Num_AndWhenSecondNumberIsMaxShouldReturn_true() {
        Float[] floatArray = {8.12f, 10.21f, 2.32f};
        Float result = maximumTest.findMaximum(floatArray);
        Assertions.assertEquals(Float.valueOf(10.21f), result);
    }

    @Test
    public void given3Num_AndWhenThirdNumberIsMax_ShouldReturn_true() {
        Float[] floatArray = {8.0f, 2.21f, 10.56f};
        Float result = maximumTest.findMaximum(floatArray);
        Assertions.assertEquals(Float.valueOf(10.56f), result);
    }
}
