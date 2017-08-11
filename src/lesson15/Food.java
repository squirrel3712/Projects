package lesson15;

public class Food {
    public void prepare(Cookable c) {
        c.cook();
    }

    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {
            @Override
            public void cook() {
                System.out.println("I am cooking");
            }
        };
        food.prepare(cookable);
    }
}
