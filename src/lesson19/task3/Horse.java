package lesson19.task3;

import java.io.*;

public class Horse extends Animal implements Serializable {
    private Halter halter;

    public Horse() {
        super();
        System.out.println("In constructor Horse");
    }

    public static void serialize(Horse horse) {
        try (OutputStream os = new FileOutputStream("src/lesson19/io/output.txt");
             ObjectOutput out = new ObjectOutputStream(os)) {
            out.writeObject(horse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deSerialize(Horse horse) {
        try (InputStream is = new FileInputStream("src/lesson19/io/output.txt");
             ObjectInput oi = new ObjectInputStream(is)) {
            horse = (Horse) oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        serialize(horse);
        deSerialize(horse);
    }
}
