package com.stackroute.Junitdemo4;
import java.util.*;
public class Countchar {
    public int charcount(String str,char ch)
    {
        //taking another string and replacing with given character
        String another=str.replaceAll(Character.toString(ch),"");
        int count=str.length()-another.length();

        return count;
    }



}
