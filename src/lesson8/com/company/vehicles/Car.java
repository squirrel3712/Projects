package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class Car {
    private String mark;
    private String classOfCar;
    private int weight;
    private Driver driver;
    private Engine engine;

    public String getMark() {
        return mark;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setClassOfCar(String classOfCar) {
        this.classOfCar = classOfCar;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Go");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnLeft() {
        System.out.println("Turn to left");
    }

    public void turnRight() {
        System.out.println("Turn to right");
    }

    public String toString() {

        return " Car : mark -  " + mark + ", class of Car - " + classOfCar +
                ", weight " + weight + driver.toString() + engine.toString();
    }
}
