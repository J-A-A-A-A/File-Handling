package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileHandler {

    public fileHandler(String filename) {

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
