package com.javafortesters.chap018propertiesandpropertyfiles;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PropertiesAndPropertyFilesTest {

    @Test
    public void createListProperties(){
        Properties myPropertiesFile = new Properties();

        myPropertiesFile.setProperty("name", "bob");
        myPropertiesFile.setProperty("gender", "male");
        myPropertiesFile.setProperty("password", "paSSw0rd");

        assertThat(myPropertiesFile.size(), is(3));

        for(String key : myPropertiesFile.stringPropertyNames()){
            System.out.println("Key: " + key + " " + "Value: " + myPropertiesFile.getProperty(key));
        }

        myPropertiesFile.list(System.out);

        assertThat(myPropertiesFile.containsKey("gender"), is(true));
        assertThat(myPropertiesFile.getProperty("name"), is("bob"));
        assertThat(myPropertiesFile.getProperty("permission", "Admin"), is("Admin"));
    }

    @Test
    public void outputSystemProperties(){
        Properties sys = System.getProperties();
        sys.list(System.out);
    }

    @Test
    public void storeAndLoadSavedProperties() throws IOException {
        Properties myProperties = new Properties();
        myProperties.setProperty("name", "jack");
        myProperties.setProperty("age", "old");

        String tempDirectory = System.getProperty("java.io.tmpdir");
        String tempResourceFilePath = new File(tempDirectory, "tempFileForPropertiesStoreTest.properties").getAbsolutePath();

        FileOutputStream outputFile = new FileOutputStream(tempResourceFilePath);
        myProperties.store(outputFile, "These are my comments");
        outputFile.close();

        FileReader propertyFileReader = new FileReader(tempResourceFilePath);
        Properties loaded = new Properties();

        try{
            loaded.load(propertyFileReader);
        }finally{
            propertyFileReader.close();
        }

        assertThat(myProperties.getProperty("name"), is("jack"));
        assertThat(myProperties.getProperty("age"), is("old"));

        new File (tempResourceFilePath).delete();
    }
}
