package com.stackroute.Junitdemo4;


public class Sort {
    public String[] convert(String str) {


        String[] array = null;
        String[] another = str.split(" ");
        //sorting by using an array and string array
        for (int i = 0; i < another.length; i++) {
            for (int j = i + 1; j < another.length; j++) {
                if (another[i].compareTo(another[j]) > 0) {
                    String temp;
                    temp = another[i];
                    another[i] = another[j];
                    another[j] = temp;
                }
            }
        }
        //returning the string array
        return another;
    }
}
