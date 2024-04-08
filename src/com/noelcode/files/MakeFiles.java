package com.noelcode.files;

import java.io.*;
import java.util.Scanner;

public class MakeFiles {
    public static void main(String[] args) {
        File file = createFile("src/boo.txt");
        writeToFile(file, false);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }
    }

    private static File createFile(String path) {
        try{
            File file = new File(path);
            if(!file.exists()){
                System.out.println("File made");
                file.createNewFile();
            }
            return file;
        }catch(IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException();
        }
    }

    private static void writeToFile(File file, boolean append){
        try{
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("2020 is the worst year");
            writer.flush(); //flush it to the file
            writer.close(); // close the writer
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
