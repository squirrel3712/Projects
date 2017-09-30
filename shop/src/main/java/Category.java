package main.java;

import java.util.*;

public class Category {
    private String name;
    private List<Devices> devices;

    public Category(String name, List<Devices> set) {
        this.name = name;
        devices = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Devices> getDevice() {
        return devices;
    }

    public void setProducts(List<Devices> setDevice) {
        this.devices = setDevice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return devices != null ? devices.equals(category.devices) : category.devices == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (devices != null ? devices.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "shop.Category{" +
                "name='" + name + '\'' +
                ", devices=" + devices +
                '}';
    }
}
