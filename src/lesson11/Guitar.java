package lesson11;

public class Guitar implements Tool {
    private int countOfStrings;

    public Guitar(int countOfStrings){
        this.countOfStrings = countOfStrings;
    }

    public int getCountOfStrings() {
        return countOfStrings;
    }

    public void setCountOfStrings(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Guitar is playing with count of string = " + getCountOfStrings());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return countOfStrings == guitar.countOfStrings;
    }

    @Override
    public int hashCode() {
        return countOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "countOfStrings=" + countOfStrings +
                '}';
    }
}
