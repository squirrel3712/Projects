package lesson7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone() {
        System.out.println("Конструктор без параметров");
        number = null;
        model = null;
        weight = -1;
    }

    Phone(String number, String model, double weight) {
        this();
        System.out.println("Конструктор с параметрами");
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " c данной модель телефона: " + number);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.receiveCall("Ann");
        phone1.receiveCall("Ann", phone1.getNumber());

        Phone phone2 = new Phone("AN8", "Samsung", 200);
        phone2.receiveCall("Oleg");
        phone2.receiveCall("Oleg", phone2.getNumber());

        Phone phone3 = new Phone("AK12", "Nokia", 300);
        phone3.receiveCall("Ilia");
        phone3.receiveCall("Ilia", phone3.getNumber());
    }
}
