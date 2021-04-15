package com.bridgelabz;

public class Maximum {
    //method takes numberArray of genenic type E and return maximum in an Array
    public <E extends Comparable> E findMaximum(E[] numberArray) {
        E max = numberArray[0];
        for (E element : numberArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
