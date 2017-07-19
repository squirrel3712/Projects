package lesson8.com.company.vehicles;

public class Lorry extends Car {
    private int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public String toString(){
        return super.toString() + " carying - " + carrying;
    }
}
