package com.stackroute.Junitdemo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort obj;
    @Before
    public void setup()
    {
        obj=new Sort();

    }
    @After
    public void teardown()
    {
        obj=null;
    }
    @Test
    public void testinput()
    {
        //All strings
        String[] result=obj.convert("i am pranitha");
        assertArrayEquals(new String[]{"am","i", "pranitha"},result);
    }
    @Test
    public void testinputspecial()
    {
        //using special characters
        String[] result=obj.convert("i am @ pranitha");
        assertArrayEquals(new String[]{"@","am","i", "pranitha"},result);
    }
    @Test
    public void testinputnumber()
    {
        //using numbers
        String[] result=obj.convert("i am a @ pranitha 117");
        assertArrayEquals(new String[]{"117","@","a","am","i", "pranitha"},result);
    }
    @Test
    public void testinputnull()
    {
        //using null value
        String[] result=obj.convert(" ");
        assertArrayEquals(new String[]{},result);
    }

}