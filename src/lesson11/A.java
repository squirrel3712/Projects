package lesson11;

public class A {
    private int priv;
    int def;
    protected int prot;
    public int pub;

    public static void main(String[] args) {
        A a = new A();
        a.pub = 5;
        a.def = 4;
        a.prot = 3;
        a.priv = 0;
    }
}
