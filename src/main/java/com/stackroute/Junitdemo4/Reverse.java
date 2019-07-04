package com.stackroute.Junitdemo4;

public class Reverse {
    public String rev(String str)
    {
        String reverse="";//empty string
        String[] another=str.split(" ");//split
        for(String i:another)
        {
            StringBuilder sb=new StringBuilder(i);
            sb.reverse();
            reverse+=sb.toString()+" ";//add to the empty string after reversing

        }
        return reverse.trim();
    }
}
