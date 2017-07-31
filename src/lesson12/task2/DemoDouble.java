package lesson12.task2;

public class DemoDouble {
    public void WrapperInt(int i, String s) {
        Integer i1 = Integer.valueOf(i);
        int i2 = Integer.parseInt(s);
        String s1 = Integer.toString(i);
        System.out.println(i1 + " " + i2 + " " + s1);
    }

    public void WrapperLong(long l, String s) {
        Long l1 = Long.valueOf(l);
        long l2 = Long.parseLong(s);
        String s1 = Long.toString(l);
        System.out.println(l1 + " " + l2 + " " + s1);
    }

    public void WrapperByte(byte b, String s) {
        Byte b1 = Byte.valueOf(b);
        byte b2 = Byte.parseByte(s);
        String s1 = Byte.toString(b);
        System.out.println(b1 + " " + b2 + " " + s1);
    }

    public void WrapperShort(short i, String s) {
        Short i1 = Short.valueOf(i);
        short i2 = Short.parseShort(s);
        String s1 = Short.toString(i);
        System.out.println(i1 + " " + i2 + " " + s1);
    }

    public void WrapperFloat(float f, String s) {
        Float f1 = Float.valueOf(f);
        float f2 = Float.parseFloat(s);
        String s1 = Float.toString(f);
        System.out.println(f1 + " " + f2 + " " + s1);
    }

    public void WrapperDouble(double d, String s) {
        Double d1 = Double.valueOf(d);
        double d2 = Double.parseDouble(s);
        String s1 = Double.toString(d);
        System.out.println(d1 + " " + d2 + " " + s1);
    }

    public void WrapperBoolen(boolean b, String s) {
        Boolean b1 = Boolean.valueOf(b);
        boolean b2 = Boolean.parseBoolean(s);
        String s1 = Boolean.toString(b);
        System.out.println(b1 + " " + b2 + " " + s1);
    }

    public void WrapperChar(char c) {
        Character c1 = Character.valueOf(c);
        String s1 = Character.toString(c);
        System.out.println(c1 + " " + " " + s1);
    }

    public static void main(String[] args) {
        DemoDouble demo = new DemoDouble();
        demo.WrapperChar('a');
        demo.WrapperBoolen(true, "dfgj");
        demo.WrapperByte((byte) 4, "120");
        demo.WrapperShort((short) 8, "8");
        demo.WrapperInt(678, "987");
        demo.WrapperLong(1234, "8");
        demo.WrapperFloat(9.87f, "8.9");
        demo.WrapperDouble(123.8, "8.9");
    }
}
