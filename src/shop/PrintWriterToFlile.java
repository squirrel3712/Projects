package shop;

import java.io.*;

public class PrintWriterToFlile {
    public static void printToFile(Bin bin) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/shop/io/purchase.txt"))) {
            bufferedWriter.write(bin.getListOfDevices().toString());
            bufferedWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
