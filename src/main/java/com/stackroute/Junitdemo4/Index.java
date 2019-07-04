package com.stackroute.Junitdemo4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Index {
    public List<String> occurences(String regex, String text) {
        //taking an empty string
        String sw = "";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        //using pattern and matcher to check
        List<String> list = new ArrayList<String>();

            while (matcher.find()) {

                sw = "Found at: " + matcher.start() +
                        " - " + (matcher.end() - 1);
                list.add(sw);
            }
            matcher=matcher.reset();
            //if found return the result
        if (matcher.find()) {
            return list;
        }
        else
            return null;

    }
}
