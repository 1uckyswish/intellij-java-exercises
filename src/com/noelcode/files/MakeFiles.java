package com.noelcode.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MakeFiles {
    public static void main(String[] args) {
        File file = createFile("src/boo.txt");
        try{
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Noel");
            writer.println("");
            writer.println("loves code");
            writer.flush(); //flush it to the file
            writer.close(); // close the writer
        }catch(IOException e){
            System.out.println(e.getMessage());
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
}
