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

    //Method of type String which returns maximum string in a string array
    public <E extends String> E findMaximumString(E[] StringArray) {
        int index = 0;
        int elementLength = StringArray[0].length();
        for(int i=1; i< StringArray.length; i++) {
            if(StringArray[i].length() > elementLength) {
                index = i; elementLength = StringArray[i].length();
            }
        }
        return StringArray[index];
    }
}