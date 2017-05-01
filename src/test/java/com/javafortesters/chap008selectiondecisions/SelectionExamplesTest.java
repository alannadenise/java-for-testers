package com.javafortesters.chap008selectiondecisions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SelectionExamplesTest {

    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);

    }

    private String addHttp(String url){
        return "http://" + url;
    }
}
