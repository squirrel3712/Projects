package lesson14;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Integer array1[] = new Integer[]{ 1, 2, 3, 4 , 5};
        Double array2[] = new Double[]{ 1.765, 2.0, 3.9, 0.0, 5.9};
        MinMax<Integer> i = new MinMax<>(array1);
        MinMax<Double> d = new MinMax<>(array2);
        System.out.println("Max of Integer array = " + i.findMax());
        System.out.println("Min of Integer array = " + i.findMin());

        System.out.println("Max of Double array = " + d.findMax());
        System.out.println("Min of Double array = " + d.findMin());
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public <T extends Comparable> T findMin() {
        T min = this.array[0];
       for(int i = 1; i<array.length; i++){
           if(min.compareTo(array[i])>0){
               min = this.array[i];
           }
       }
       return min;
    }

    public <T extends Comparable>T findMax() {
        T max = this.array[0];
        for(int i = 1; i<array.length; i++){
            if(max.compareTo(array[i])<0){
                max = this.array[i];
            }
        }
        return max;
    }
}
