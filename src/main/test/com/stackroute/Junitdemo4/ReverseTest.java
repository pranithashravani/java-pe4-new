package com.stackroute.Junitdemo4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
    Reverse obj;
    @Before
    public void setup()
    {
        obj=new Reverse();
    }
    @After
    public void teardown()
    {
        obj=null;
    }
    @Test
    public void testsort()
    {
        String result=obj.rev("I am prani");
        assertEquals("I ma inarp",result);
    }
    @Test
    public void testsortgiveninput()
    {
        String result=obj.rev("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
    @Test
    public void testsortwithnullvalue()
    {
        String result=obj.rev(" ");
        assertEquals("",result);
    }
    @Test
    public void testsortwithnumber()
    {
        String result=obj.rev("567");
        assertEquals("765",result);
    }
    @Test
    public void testsortwithspecialcharacters()
    {
        String result=obj.rev("hello@");
        assertEquals("@olleh",result);
    }
}
