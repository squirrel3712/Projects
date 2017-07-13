package lesson7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getPhoneNumber() {
        return this.number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setModel("Samsung");
        phone1.setWeight(200);
        phone1.setNumber("AN8");
        phone1.receiveCall("Ann");
        Phone phone2 = new Phone();
        phone2.setModel("IPhone");
        phone2.setWeight(150);
        phone2.setNumber("7");
        phone2.receiveCall("Oleg");
        Phone phone3 = new Phone();
        phone3.setModel("Nokia");
        phone3.setWeight(300);
        phone3.setNumber("AK12");
        phone3.receiveCall("Ilia");
    }
}
