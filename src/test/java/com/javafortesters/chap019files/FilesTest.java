package com.javafortesters.chap019files;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FilesTest {

    @Test
    public void createTempFile() throws IOException{
            File myTempFile = File.createTempFile("cottontail", "theSuffix");

            assertThat(myTempFile.exists(), is(true));

            myTempFile.deleteOnExit();
    }

    @Test
    public void writeOutTheRoots(){
        File[] roots = File.listRoots();
        Assert.assertTrue(roots.length > 0);

        for(File aFile : roots){
            System.out.println(aFile.getAbsolutePath());
        }

    }

    @Test
    public void createFileWithCustomCode() throws IOException{
        File aTempFile = new File ("d:/tempJavaForTesters.txt");
        assertThat(aTempFile.exists(), is(false));
        aTempFile.createNewFile();
        assertThat(aTempFile.exists(), is(true));
        aTempFile.delete();
        assertThat(aTempFile.exists(), is(false));
    }

}