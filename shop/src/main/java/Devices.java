package main.java;

import java.io.Serializable;

public class Devices implements Serializable {
    private String name;
    private int cost;
    private int weight;
    private int ram;
    private int sizeOfScreen;

    public Devices(String name, int cost, int weight, int ram, int sizeOfScreen) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.ram = ram;
        this.sizeOfScreen = sizeOfScreen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSizeOfScreen() {
        return sizeOfScreen;
    }

    public void setSizeOfScreen(int sizeOfScreen) {
        this.sizeOfScreen = sizeOfScreen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Devices devices = (Devices) o;

        if (cost != devices.cost) return false;
        if (weight != devices.weight) return false;
        if (ram != devices.ram) return false;
        if (sizeOfScreen != devices.sizeOfScreen) return false;
        return name != null ? name.equals(devices.name) : devices.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        result = 31 * result + weight;
        result = 31 * result + ram;
        result = 31 * result + sizeOfScreen;
        return result;
    }

    @Override
    public String toString() {
        return "shop.Devices{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", ram=" + ram +
                ", sizeOfScreen=" + sizeOfScreen +
                '}';
    }
}
