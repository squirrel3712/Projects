package lesson8.com.company.professions;

import lesson8.Person;

public class Driver extends Person {
    private String fullName;
    private int drivingExperience;

    public String getFullName() {
        return fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public String toString() {
        return '\n' + " Driver : full name - " + fullName + ", exprience - " + drivingExperience +
                super.toString();
    }
}
