package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
       Path path = Paths.get("D:/test3/ta/a.txt");
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        File file = new File("D:/test/ta/ha.txt");
//        file.mkdirs();
        System.out.println("ha");

    }
}
