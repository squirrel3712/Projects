package lesson8.com.company.vehicles;

public class SportCar extends Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        return super.toString() + ", speed - " + speed;
    }
}
