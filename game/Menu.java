package game;

import java.util.Scanner;

public class Menu {
    public int checkInput() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean flag;
        do {
            try {
                System.out.println("Selection : ");
                input = sc.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Error!!! " + '\n' + e);
                System.out.println();
                flag = true;
            }
            sc.nextLine();
        } while (flag);
        return input;
    }

    public void chooseEnemy() {
        int input;
        System.out.println("[ Main Menu ]");
        System.out.println();
        System.out.println("( 1 ) Player VS CPU ");
        System.out.println("( 2 ) Player VS Player ");
        System.out.println("( 3 ) Quit ");
        System.out.println();
        input = checkInput();
        switch (input) {
            case 1:
                chooseLevel();
                break;
            case 2:
                chooseLevel();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Incorrect symbol!!!" + '\n' + "Try again!!!");
                System.out.println();
        }
    }

    public void chooseLevel() {
        int input;
        System.out.println(" [ Choose a level of difficulty ]");
        System.out.println();
        System.out.println("( 1 ) Normal");
        System.out.println("( 2 ) Hard");
        System.out.println("( 3 ) Harder");
        System.out.println();
        System.out.println("Selection : ");
        input = checkInput();
        switch (input) {
            case 1:
            case 2:
            case 3:
            default:
                System.out.println("Incorrect symbol!!!" + '\n' + "Try again!!!");
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Menu m = new Menu();
        m.chooseEnemy();
    }
}package game;

import java.util.Scanner;

public class Menu {
    public int checkInput() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean flag;
        do {
            try {
                System.out.println("Selection : ");
                input = sc.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Error!!! " + '\n' + e);
                System.out.println();
                flag = true;
            }
            sc.nextLine();
        } while (flag);
        return input;
    }

    public void chooseEnemy() {
        int input;
        System.out.println("[ Main Menu ]");
        System.out.println();
        System.out.println("( 1 ) Player VS CPU");
        System.out.println("( 2 ) Player VS Player");
        System.out.println("( 3 ) Quit");
        System.out.println();
        input = checkInput();
        switch (input) {
            case 1:
                chooseLevel();
                break;
            case 2:
                chooseLevel();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Incorrect symbol!!!" + '\n' + "Try again!!!");
                System.out.println();
        }
    }

    public void chooseLevel() {
        int input;
        System.out.println(" [ Choose a level of difficulty ]");
        System.out.println();
        System.out.println("( 1 ) Normal");
        System.out.println("( 2 ) Hard");
        System.out.println("( 3 ) Harder");
        System.out.println();
        input = checkInput();
        switch (input) {
            case 1:
                System.out.println("( 1 ) Normal");
                break;
            case 2:
                System.out.println("( 2 ) Hard");
                break;
            case 3:
                System.out.println("( 3 ) Harder");
                break;
            default:
                System.out.println("Incorrect symbol!!!" + '\n' + "Try again!!!");
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Menu m = new Menu();
        m.chooseEnemy();
    }
}
