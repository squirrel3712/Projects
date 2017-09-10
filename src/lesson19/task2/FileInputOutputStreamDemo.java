package lesson19.task2;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String args[]) {
        try (OutputStream output = new FileOutputStream("src/lesson19/io/a.txt");
             InputStream input = new FileInputStream("src/lesson19/io/a.txt")) {
            char c[] = {'a', 'b', 'c'};
            for (char ch : c) {
                output.write(ch);
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
