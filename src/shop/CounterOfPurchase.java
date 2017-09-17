package shop;

public class CounterOfPurchase {
    public int count(Purchase purchase) {
        int sum = 0;
        for (int i = 0; i < purchase.getDevicesList().size(); i++) {
            sum += purchase.getDevicesList().get(i).getCost();
        }
        System.out.println("You make purchase which cost =  " + sum);
        System.out.println();
        return sum;
    }
}
