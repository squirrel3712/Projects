package lesson12.task1;

public class SeasonDemo {
    public void chooseSeason(Seasons seasons) {
        switch (seasons) {
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
        }
    }

    public static void main(String[] args) {
        Seasons spring = Seasons.SPRING;
        SeasonDemo seasonDemo = new SeasonDemo();
        seasonDemo.chooseSeason(spring);

        Seasons[] array = Seasons.values();
        for (Seasons s : array) {
            System.out.println(s + " - " + s.ordinal() + " " + " average temperature = " +
                    s.getTemp() + " " + s.getDescription());
        }

        Seasons winter = Seasons.valueOf("WINTER");
        seasonDemo.chooseSeason(winter);
        System.out.println("The average temperature = " + winter.getTemp());
        System.out.println(winter.getDescription());
    }
}
