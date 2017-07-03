package lesson4;

public class AverageValue {
    public static void main(String[] args) {
        double average = 0;
        int count = 0;
        for (String str : args) {
            count++;
            average += Double.parseDouble(str);
        }
        System.out.println("Среднее значение  = " + average / count);
    }
}
