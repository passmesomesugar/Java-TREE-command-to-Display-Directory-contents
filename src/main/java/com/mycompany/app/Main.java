package com.mycompany.app;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        if (file.isDirectory()) {
            System.out.println("Your input path contains folder " + file.getPath());
            System.out.println("Ваш путь содержит папку");
            System.out.println("Processing...");
            System.out.println("Процесс...");
            System.out.println("Your file will be here:");
            System.out.println(System.getProperty("user.dir"));
        } else {
            System.out.println("Your input path contains file: " + file.getPath());
            System.out.println("Ваш путь содержит файл");
            System.out.println("Parsing...");
            System.out.println("Идет парсинг");
        }
        FileInput fileInput = new FileInput();
        fileInput.readFile(file.getPath());
    }
}

