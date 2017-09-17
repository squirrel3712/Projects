package shop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Registration registrator = new Registration();
        User user1 =  registrator.registration();
        if (!user1.getLogin().equals("") && !user1.getPassword().equals("")) {
            map.put(user1.getLogin(), user1.getPassword());
        }
        List<Devices> listOfPC = new ArrayList<>();
        List<Devices> listOfLaptop = new ArrayList<>();
        Devices pc1 = new Pc("Apple iMac 22", 22000, 5, 8, 22);
        Devices pc2 = new Pc("Apple iMac 27", 60000, 5, 8, 27);
        Devices pc3 = new Pc("Apple iMac with Retina 5K display 27", 70000, 10, 8, 27);
        listOfPC.add(pc1);
        listOfPC.add(pc2);
        listOfPC.add(pc3);
        Devices l1 = new Laptop("Apple MacBook 12", 39000, 1, 8, 12);
        Devices l2 = new Laptop("Apple MacBook Air 13", 25000, 2, 8, 13);
        Devices l3 = new Laptop("Apple MacBook Pro 13", 36000, 2, 8, 12);
        listOfLaptop.add(l1);
        listOfLaptop.add(l2);
        listOfLaptop.add(l3);
        Category category1 = new Category("PC", listOfPC);
        Category category2 = new Category("shop.Laptop", listOfLaptop);
        Printer printer = new Printer();
        printer.printInfo(category1, category2);
    }
}
