package com.stackroute.Junitdemo4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public String regular(String str) {
        //initialize at first the string to return
        String s1 = "Is Harry there?True";
        String s2 = "Is Harry there?False";
        String s=null;
        // Create a pattern to be searched
        Pattern pattern = Pattern.compile("Harry", Pattern.CASE_INSENSITIVE);

        // Search above pattern
        Matcher m = pattern.matcher(str);
        if(m.find())
        {
            s=s1;
        }
        else {
            s = s2;
        }
return s;
    }
}
