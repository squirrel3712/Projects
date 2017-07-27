package lesson11;

public class TestTools {
    public static void main(String[] args) {
        Tool tools[] = new Tool[3];
        tools[0] = new Guitar(5);
        tools[1] = new Drum(100);
        tools[2] = new Trumpet(60);
        for(Tool t : tools){
            t.play();
        }
    }
}
