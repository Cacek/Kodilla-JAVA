package com.kodilla.exception.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileReader {

    public void readFile() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/airports.txt").getFile());

        try  (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
        
        } catch (IOException e) {
            System.out.println("cos poszlo nie tak:" + e);
        }
    }


}
