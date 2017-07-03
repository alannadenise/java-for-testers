package com.javafortesters.chap019files;

import org.junit.Assert;
import org.junit.Test;

import javax.sound.midi.Soundbank;
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

    @Test
    public void checkTempDirIsDir(){
        File tempA = new File(System.getProperty("java.io.tmpdir"));

        assertThat(tempA.isDirectory(), is(true));
        assertThat(tempA.isFile(), is(false));
    }

    @Test
    public void writeToPrintWriterThenAppend() throws IOException{
        File aTempFile = File.createTempFile("printWriterPrint", null);

        System.out.println("First text");

        FileWriter writer = new FileWriter(aTempFile);
        BufferedWriter  buffer = new BufferedWriter(writer);
        PrintWriter print = new PrintWriter(buffer);

        print.println("My second bit of text");
        print.close();

        //appending the file
        writer = new FileWriter(aTempFile, true);
        buffer = new BufferedWriter(writer);
        print = new PrintWriter(buffer);
        print.println("third bit of text");
        print.close();

    }

    @Test
    public void calcFileLength()throws IOException{
        File aTempFile = File.createTempFile("printWriterPrint", null);

        FileWriter writer = new FileWriter(aTempFile);
        BufferedWriter  buffer = new BufferedWriter(writer);
        PrintWriter print = new PrintWriter(buffer);

        print.println("My first bit of text");
        print.close();

        System.out.println(aTempFile.length());

    }

}