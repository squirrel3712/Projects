package main.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public User registration() {
        Scanner sc = new Scanner(System.in);
        String login = "";
        String password = "";
        System.out.println("Enter your login");
        if (sc.hasNext()) {
            login = sc.next();
        }
        System.out.println("Enter your password");
        if (sc.hasNext()) {
            password = sc.next();
        }
        if (checkInfo(login, password)) {
            System.out.println("Welcome to the shop " + login);
            return new User(login, password, new Bin());
        }
        return new User();
    }

    public boolean checkInfo(String login, String password) {
        boolean state = true;
        Pattern pattern = Pattern.compile("^[a-z0-9_]{7,20}$");
        Matcher matcher1 = pattern.matcher(login);
        Matcher matcher2 = pattern.matcher(password);
        if (!matcher1.matches()) {
            state = false;
        }
        if (!matcher2.matches()) {
            state = false;
        }
        return state;
    }
}
