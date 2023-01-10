package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void betterWholeFileRead(){
        try {
            FileReader fr = new FileReader("input_file.txt");
            BufferedReader br = new BufferedReader(fr);
            int ascii = 0;
            while (ascii != -1){
                ascii = br.read();
                char letter = (char)ascii;
                if (ascii != -1) {
                    System.out.print(letter);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        betterWholeFileRead();
    }
}
