package com.stackroute.Junitdemo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    Replace obj;
    @Before
    public void setup()
    {
        obj=new Replace();
    }
    @After
    public void teardown()
    {
        obj=null;
    }
@Test
//given string
    public void testreplace()
{
    String result=obj.letter("daily dry");
    assertEquals("faity fry",result);
}
    @Test
    public void testreplacef()
    {
        String result=obj.letter("finland");
        assertEquals("fintanf",result);
    }
    @Test
    public void testreplacenothing()
    {
        String result=obj.letter("pranitha");
        assertEquals("pranitha",result);
    }
    @Test
    //given number
    public void testreplacedigit()
    {
        String result=obj.letter("6757");
        assertEquals("6757",result);
    }
    @Test
    //given special characters
    public void testreplacespecial()
    {
        String result=obj.letter("fairy@tale");
        assertEquals("fairy@tate",result);
    }
}