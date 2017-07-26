package lesson11;

public class Trumpet implements Tool {
    private int diametr;

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return diametr == trumpet.diametr;
    }

    @Override
    public int hashCode() {
        return diametr;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diametr=" + diametr +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Trumpet is playing");
    }
}
