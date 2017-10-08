package com.company;

import java.util.List;

public class AdderToBin {
    public void addToBin(Bin bin, List<Devices> devicesList) {
        bin.setListOfDevices(devicesList);
        for(Devices devices: devicesList){
            System.out.println("In your bin was put ---" + devices.getName());
        }
        System.out.println();
    }
}