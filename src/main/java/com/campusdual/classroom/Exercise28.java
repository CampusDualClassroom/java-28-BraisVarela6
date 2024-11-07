package com.campusdual.classroom;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise28 {
    public static void main(String[] args) throws Exception {

    launchException();

    }

    public static void launchException() throws Exception {
        throw new Exception("This is a test exception");
    }

}
