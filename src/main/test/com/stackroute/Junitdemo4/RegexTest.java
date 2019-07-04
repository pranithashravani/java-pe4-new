package com.stackroute.Junitdemo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexTest {
    Regex obj;
    @Before
    public void setup()
    {
        obj=new Regex();

    }
@After
    public void teardown()
{
    obj=null;
}
@Test
    public void testregex()
{
    String result=obj.regular("Hi,Harry");
    assertEquals("Is Harry there?True",result);
}
    @Test
    public void testregexrepeat()
    {
        String result=obj.regular("HarryHarry");
        assertEquals("Is Harry there?True",result);
    }
    @Test
    public void testregexonlyone()
    {
        String result=obj.regular("harry");
        assertEquals("Is Harry there?True",result);
    }
    @Test
    public void testregextwowords()
    {
        String result=obj.regular("Hi,Henry");
        assertEquals("Is Harry there?False",result);
    }
    @Test
    public void testregexspecial()
    {
        //with the special characters
        String result=obj.regular("Harry@gmail.com");
        assertEquals("Is Harry there?True",result);
    }
    @Test
    public void testregexdigit()
    {
        //with the digits included
        String result=obj.regular("harr4y");
        assertEquals("Is Harry there?False",result);
    }
    @Test
    public void testregexnull()
    {
        //using a null value
        String result=obj.regular(" ");
        assertNotEquals("Is Harry there?True",result);
    }

}