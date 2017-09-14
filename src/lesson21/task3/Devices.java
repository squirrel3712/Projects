package lesson21.task3;

/**
 * This class was created for my Online Shop.
 * It is contains general information about all devices which will be sold
 *
 * @author Ann
 * @since JDK1.0
 */

public class Devices {
    /**
     * defend variable uses for getting and setting name
     */
    private String name;
    /**
     * defend variable uses for getting and setting cost
     */
    private int cost;
    /**
     * defend variable uses for getting and setting weight
     */
    private int weight;
    /**
     * defend variable uses for getting and setting ram
     */
    private int ram;
    /**
     * defend variable uses for getting and setting size of screen
     */
    private int sizeOfScreen;

    /**
     * @param name
     * @param cost
     * @param weight
     * @param ram
     * @param sizeOfScreen Use constructor for creating device
     */
    public Devices(String name, int cost, int weight, int ram, int sizeOfScreen) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
        this.ram = ram;
        this.sizeOfScreen = sizeOfScreen;
    }

    /**
     * @return name
     * method for getting name
     */

    public String getName() {
        return name;
    }

    /**
     * @param name set name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return cost
     * <p>
     * method for getting cost
     */

    public int getCost() {
        return cost;
    }

    /**
     * @param cost set cost
     */

    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return weight
     */

    public int getWeight() {
        return weight;
    }

    /**
     * @param weight
     */

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return ram
     */

    public int getRam() {
        return ram;
    }

    /**
     * @param ram
     */

    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return size of screen
     */

    public int getSizeOfScreen() {
        return sizeOfScreen;
    }

    /**
     * @param sizeOfScreen
     */

    public void setSizeOfScreen(int sizeOfScreen) {
        this.sizeOfScreen = sizeOfScreen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Devices devices = (Devices) o;

        if (cost != devices.cost) return false;
        if (weight != devices.weight) return false;
        if (ram != devices.ram) return false;
        if (sizeOfScreen != devices.sizeOfScreen) return false;
        return name != null ? name.equals(devices.name) : devices.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        result = 31 * result + weight;
        result = 31 * result + ram;
        result = 31 * result + sizeOfScreen;
        return result;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", ram=" + ram +
                ", sizeOfScreen=" + sizeOfScreen +
                '}';
    }
}
