package lesson8.com.company.details;

public class Engine {
    private int power;
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public String getProducer() {
        return company;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setProducer(String company) {
        this.company = company;
    }

    public String toString() {
        return '\n' + " Engine :  pover - " + power + ", company - " + company;
    }
}
