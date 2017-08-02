package lesson13.task4;

public class DemoFormat {
    public String changeString(String s) {
        String str = s.toLowerCase().replaceAll("object oriented programming", "OOP");
        return str;
    }

    public String findMiddleOfString(String str) {
        String s = "";
        int start = str.trim().length() / 2 - 1;
        int finish = start + 2;
        if (str.length() % 2 == 0) {
            s = str.substring(start, finish);
        } else {
            System.out.println("Forbidden string");
        }
        return s;
    }

    public static void main(String[] args) {
        DemoFormat d = new DemoFormat();
        String s = "Java - Object oriented Programming";
        System.out.println("String before changing" + s);
        System.out.println("String after: " + d.changeString(s));

        System.out.println(d.findMiddleOfString("code"));
    }
}
