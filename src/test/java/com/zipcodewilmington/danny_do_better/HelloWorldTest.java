package com.zipcodewilmington.danny_do_better;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/1/18.
 */
public class HelloWorldTest {
    public static final HelloWorld helloWorld = new HelloWorld();

    @Test
    public void TestHelloWorld(){
        String expected = "Hello World";
        String actual = helloWorld.helloWorld();
        assertEquals(expected,actual);
    }

}