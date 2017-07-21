package lesson8;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;
import lesson8.com.company.vehicles.Lorry;

public class TestCar {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Lorry lorry = new Lorry();
        Engine engine = new Engine();
        engine.setPower(50);
        engine.setProducer("Paris");
        driver.setDrivingExperience(10);
        driver.setFullName("Ann Chunosova");
        driver.setAge(19);
        lorry.setClassOfCar("A");
        lorry.setDriver(driver);
        lorry.setEngine(engine);
        lorry.setMark("AB1000");
        lorry.setWeight(10000);
        lorry.setCarrying(4);
        System.out.println(lorry.toString());
    }
}
