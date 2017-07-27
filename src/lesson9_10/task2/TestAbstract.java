package lesson9_10.task2;

public class TestAbstract {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Circles("yellow");
        shape[1] = new Rectangle("red");
        shape[2] = new Rectangle("green");
        for (Shape s : shape) {
            s.draw();
        }
        System.out.println(shape[0]);
    }
}
