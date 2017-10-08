package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bin implements Serializable {
    private List<Devices> listOfDevices = new ArrayList<>();

    public Bin(){
    }

    public Bin(List<Devices> listOfDevices) {
        this.listOfDevices = listOfDevices;
    }

    public List<Devices> getListOfDevices() {
        return listOfDevices;
    }

    public void setListOfDevices(List<Devices> listOfDevices) {
        this.listOfDevices = listOfDevices;
    }

    public void serialize() {
        try (OutputStream os = new FileOutputStream("src/main/java/io/serialize.txt");
             ObjectOutput out = new ObjectOutputStream(os)) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Bin deSerialize() {
        Bin bin = null;
        try (InputStream is = new FileInputStream("src/main/java/io/serialize.txt");
             ObjectInput oi = new ObjectInputStream(is)) {
            bin = (Bin) oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bin;
    }

    @Override
    public String toString() {
        return "shop.Bin{" +
                "listOfDevices=" + listOfDevices +
                '}'+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bin bin = (Bin) o;

        return listOfDevices != null ? listOfDevices.equals(bin.listOfDevices) : bin.listOfDevices == null;
    }

    @Override
    public int hashCode() {
        return listOfDevices != null ? listOfDevices.hashCode() : 0;
    }
}
