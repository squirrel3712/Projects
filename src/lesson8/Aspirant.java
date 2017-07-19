package lesson8;

public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String secondName, String scientificWork){
        super(firstName,secondName);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }
}
