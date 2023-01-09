package com.company;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void simplesRead(){
        try {
            FileReader fr = new FileReader("input_file.txt");
            int ascii = fr.read();
            System.out.println(ascii);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
