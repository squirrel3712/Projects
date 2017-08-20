package lesson17.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseMap {

    public static void viewWithValues(Map<String, Toy> map) {
        for (Toy toy : map.values()) {
            System.out.println(toy);
        }
    }

    public static void viewWithEntrySet(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> m = map.entrySet();
        for (Map.Entry<String, Toy> entry : m) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
    }

    public static void viewWithKeySet(Map<String, Toy> map) {
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.print(s + " ");
            System.out.println(map.get(s));
        }
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy("Doll", 400);
        Toy toy2 = new Toy("Car", 500);
        Toy toy3 = new Toy("Box", 700);

        Map<String, Toy> map = new HashMap<>();
        map.put(toy1.getName(), toy1);
        map.put(toy2.getName(), toy2);
        map.put(toy3.getName(), toy3);

        System.out.println("Method values():");
        viewWithValues(map);
        System.out.println("Method entrySet():");
        viewWithEntrySet(map);
        System.out.println("Method keySet():");
        viewWithKeySet(map);
    }
}
