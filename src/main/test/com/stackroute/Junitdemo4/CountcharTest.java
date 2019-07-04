package com.stackroute.Junitdemo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountcharTest {
    Countchar obj;
    @Before
    public void setup()
    {
        obj=new Countchar();
    }
@After
    public void teardown()
{
    obj=null;
}
@Test
    public void testcount()
        //giving a character
{
    int result=obj.charcount("pranitha",'a');
    assertEquals(2,result);
}
    @Test
    public void testcountspecial()
            //giving a special character
    {
        int result=obj.charcount("pranitha",'@');
        assertEquals(0,result);
    }
    @Test
    //capital letter
    public void testcountcapital()
    {
        int result=obj.charcount("pranitha",'A');
        assertEquals(0,result);
    }
    @Test
    //null value
    public void testcountnull()
    {
        int result=obj.charcount("pranitha",' ');
        assertEquals(0,result);
    }
    @Test
    //number-notequals
    public void testcountdigit()
    {
        int result=obj.charcount("pranitha",'8');
        assertNotEquals(6,result);
    }
    @Test
    //number-equals
    public void testcountdigitright()
    {
        int result=obj.charcount("pranitha",'8');
        assertEquals(0,result);
    }
}