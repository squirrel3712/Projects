package lesson19.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String args[]) {

        try (FileInputStream fileIn = new FileInputStream("src/lesson19/io/file.txt");
             FileOutputStream fileOut = new FileOutputStream("src/lesson19/io/copied_file.txt")) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

