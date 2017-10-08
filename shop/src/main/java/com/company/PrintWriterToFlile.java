package com.company;

import java.io.*;

public class PrintWriterToFlile {
    public static void printToFile(Bin bin) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/com/company/io/purchase.txt"))) {
            bufferedWriter.write(bin.getListOfDevices().toString());
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
