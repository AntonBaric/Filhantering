package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void readFile() {
        Path path = Paths.get("src/com/company/fotboll.txt");

        try {
            List<String> ourFile = Files.readAllLines(path);
            for (String line : ourFile) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void writeToFile() {
        List<String> newText = new ArrayList<>();
        newText.add(" ");
        newText.add("Ny data ...");
        newText.add("Real Madrid");
        newText.add("Kulladals FF");
        newText.add("Dinamo Zagreb");

        try {
            Path path = Paths.get("src/com/company/fotboll.txt");
            Files.write(path, newText, StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeObject(Object object) {
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("Player.ser", true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object readObject(String fileName) {
        ObjectInputStream objectInputStream = null;
        Object object = null;

        try {
            FileInputStream streamIn = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(streamIn);
            object = objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
