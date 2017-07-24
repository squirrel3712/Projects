package lesson9_10;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String secondName, String scientificWork) {
        super(firstName, secondName);
        this.scientificWork = scientificWork;
    }

    public int getScholorship(){
        final int i = 2000;
        System.out.println("Sholorship in Aspirant = " + i);
        return i;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }
}
