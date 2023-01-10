package com.company;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void simplesRead(){
        try {
            FileReader fr = new FileReader("input_file.txt");
            int ascii = 0;
            while (ascii != -1){
                ascii = fr.read();
                char letter = (char)ascii;
                System.out.println(letter);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
	    simplesRead();
    }
}
