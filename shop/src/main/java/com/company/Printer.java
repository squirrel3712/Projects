package com.company;

import java.util.*;

public class Printer {
    private final String INCORRECT_INPUT = "Incorrect symbol!!!";
    private final String TRY = "Try again";

    public void printProduct(List s) {
        Iterator iterator = s.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            System.out.println(i + " --- " + iterator.next() + " ");
            i++;
        }
        System.out.println();
    }

    public int reviewMenuOneMoreTime() {
        int parameter;
        do {
            System.out.println("Choose parameter of sorting  catalog");
            System.out.println("1 - name");
            System.out.println("2 - cost");
            System.out.println("3 - size of screen");
            System.out.println("4 - RAM");
            System.out.println("5 - weight");
            System.out.println("Choose parameter for sorting");
            parameter = Input.entranceNumber();
            if (parameter >= 1 && parameter <= 5) {
                return parameter;
            } else {
                System.out.println(INCORRECT_INPUT + '\n' + TRY);
            }
        } while (true);
    }

    public void sortMenu(List<Devices> list) {
        switch (reviewMenuOneMoreTime()) {
            case 1:
                if (chooseType()) {
                    list.sort(new AscendingComparatorOfName());
                } else {
                    list.sort(Collections.reverseOrder(new AscendingComparatorOfName()));
                }
                printProduct(list);
                break;
            case 2:
                if (chooseType()) {
                    list.sort(new AscendingComparatorOfPrice());
                } else {
                    list.sort(Collections.reverseOrder(new AscendingComparatorOfPrice()));
                }
                printProduct(list);
                break;
            case 3:
                if (chooseType()) {
                    list.sort(new AscendingComparatorOfSizeScreen());
                } else {
                    list.sort(Collections.reverseOrder(new AscendingComparatorOfSizeScreen()));
                }
                printProduct(list);
                break;
            case 4:
                if (chooseType()) {
                    list.sort(new AscendingComparatorOfRam());
                } else {
                    list.sort(Collections.reverseOrder(new AscendingComparatorOfRam()));
                }
                printProduct(list);
                break;
            case 5:
                if (chooseType()) {
                    list.sort(new AscendingComparatorOfWeight());
                } else {
                    list.sort(Collections.reverseOrder(new AscendingComparatorOfWeight()));
                }
                printProduct(list);
                break;
        }
    }

    public void printCatalog(Category... categories) {
        int i = 1;
        for (Category c : categories) {
            System.out.println(i + " catalog of - " + c.getName());
            ++i;
        }
    }

    public void printInfo(Category... categories) {
        int index;
        Category category;
        do {
            System.out.println("Choose catalog to watch");
            index = Input.entranceNumber();
            if (index >= 1 && index <= categories.length) {
                category = categories[index - 1];
                break;
            } else {
                System.out.println(INCORRECT_INPUT + '\n' + TRY);
            }
        } while (true);
        sortMenu(category.getDevice());
        reviewingOrSelectDeviceToBin(index - 1, categories);
    }

    public boolean chooseType() {
        int type;
        do {
            System.out.println("Select type of sorting:\n" +
                    "1 - Ascending\n" + "2 - Descending");
            type = Input.entranceNumber();
            switch (type) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    System.out.println(INCORRECT_INPUT + '\n' + TRY);
            }
        } while (true);
    }

    public void reviewingOrSelectDeviceToBin(int index, Category... categories) {
        int number;
        List<Devices> devicesList = new ArrayList<>();
        Bin bin = new Bin();
        RemoverFromBin removerFromBin = new RemoverFromBin();
        Purchase purchase = new Purchase();
        AdderToBin adderToBin = new AdderToBin();
        CounterOfPurchase counterOfPurchase = new CounterOfPurchase();
        do {
            System.out.println("1 - Revise catalogs one more time");
            System.out.println("2 - Choose device to put in bin");
            System.out.println("3 - Look at bin");
            System.out.println("4 - Make purchase");
            System.out.println("5 - Exit");
            switch (Input.entranceNumber()) {
                case 1:
                    printInfo(categories);
                    break;
                case 2:
                    System.out.println("Enter the number of device");
                    number = Input.entranceNumber();
                    do {
                        if (number >= 1 && number <= categories[index].getDevice().size()) {
                            devicesList.add(categories[index].getDevice().get(number - 1));
                            adderToBin.addToBin(bin, devicesList);
                            break;
                        } else {
                            System.out.println(INCORRECT_INPUT + '\n' + TRY);
                            number = Input.entranceNumber();
                        }
                    } while (true);
                    break;
                case 3:
                    if (bin.getListOfDevices().isEmpty()) {
                        System.out.println("Bin is empty");
                    } else {
                        int choice;
                        printProduct(bin.getListOfDevices());
                        System.out.println("Do you want to delete device");
                        System.out.println("1 - Yes");
                        System.out.println("2 - No");
                        choice = Input.entranceNumber();
                        if (choice == 1) {
                            System.out.println("Enter the number of device:");
                            choice = Input.entranceNumber();
                            if (choice >= 1 && choice <= bin.getListOfDevices().size()) {
                                removerFromBin.removeDevicesFromBin(bin, choice - 1);
                            } else {
                                System.out.println(INCORRECT_INPUT + '\n' + TRY);
                            }
                        }
                    }
                    break;
                case 4:
                    if (bin.getListOfDevices().isEmpty()) {
                        System.out.println("Bin is empty");
                    } else {
                        purchase.setDevicesList(bin.getListOfDevices());
                        counterOfPurchase.count(purchase);
                        PrintWriterToFlile.printToFile(bin);
                        bin.serialize();
                        for (int i = 0; i < bin.getListOfDevices().size(); i++) {
                            removerFromBin.removeDevicesFromBin(bin, i);
                        }
                    }
                    break;
                case 5:
                    Exit.close();
                    break;
                default:
                    System.out.println(INCORRECT_INPUT + '\n' + TRY);
            }
        } while (true);

    }
}