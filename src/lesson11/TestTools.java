package lesson11;

public class TestTools {
    public static void main(String[] args) {
        Tool tools[] = new Tool[3];
        tools[0] = new Guitar();
        tools[1] = new Drum();
        tools[2] = new Trumpet();
        for(Tool t : tools){
            t.play();
        }
    }
}
