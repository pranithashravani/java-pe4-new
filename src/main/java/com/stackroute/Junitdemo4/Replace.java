package com.stackroute.Junitdemo4;

public class Replace {
    public String letter(String str)
    {
        //replacing the certain characters with the other
        String another=str.replaceAll(Character.toString('d'),Character.toString('f'));//replacing d with f
        String another2=another.replaceAll(Character.toString('l'),Character.toString('t'));//replacing l with t
        return another2;//returning string
    }
}
