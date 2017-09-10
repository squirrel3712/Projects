package lesson19;

import java.io.*;

public class UseWrapping {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/lesson19/io/buffWriter.txt"));
             BufferedReader br = new BufferedReader(new FileReader("src/lesson19/io/buffWriter.txt"))) {
            String text = "I like Java!!!";
            bufferedWriter.write(text);
            bufferedWriter.flush();

            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
