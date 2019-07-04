package com.stackroute.Junitdemo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IndexTest {
    Index obj;

    @Before
    public void setup() {
        obj = new Index();

    }

    @After
    public void teardown() {
        obj = null;
    }

    @Test
    //giving the whole input as words
    public void testindex() {
        List<String> result=obj.occurences("se","she sells seashells by the seashore");
        List<String > h =new ArrayList<>();
        h.add("Found at: 4 - 5");
        h.add("Found at: 10 - 11");
        h.add("Found at: 27 - 28");
        assertEquals(h,result);
    }
    @Test
    public void testindexrepeat() {
        //repeated words
        List<String> result=obj.occurences("Hi","Hi,Hi,Hi");
        List<String > h =new ArrayList<>();
        h.add("Found at: 0 - 1");
        h.add("Found at: 3 - 4");
        h.add("Found at: 6 - 7");
        assertEquals(h,result);
    }
    @Test
    public void testindexnull() {
        //checking null value
        List<String> result=obj.occurences(" ","she sells seashell");
        List<String > h =new ArrayList<>();
        h.add("Found at: 3 - 3");
        h.add("Found at: 9 - 9");

        assertEquals(h,result);
    }
    @Test
    public void testindexwrong() {
        //checking with the wrong input
        List<String> result=obj.occurences("xyz","she sells seashell");
        List<String > h =new ArrayList<>();

        assertEquals(null,result);
    }

}