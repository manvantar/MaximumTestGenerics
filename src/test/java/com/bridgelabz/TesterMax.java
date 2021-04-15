package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesterMax {
    private static  Maximum maximumTest = new Maximum();

    @Test
    public void given3Num_and_when_firstNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {10, 8, 2};
        Integer result = maximumTest.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(10), result);
    }

    @Test
    public void given3Num_AndWhenSecondNumberIsMaxShouldReturn_true() {
        Integer[] intArray = {8, 10, 2};
        Integer result = maximumTest.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(10), result);
    }

    @Test
    public void given3Num_AndWhenThirdNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {8, 2, 10};
        Integer result = maximumTest.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(10), result);
    }
}
