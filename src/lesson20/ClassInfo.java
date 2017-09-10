package lesson20;

import java.util.Arrays;

public class ClassInfo {
    public static void main(String[] args) {
        Class threadSynchClass = ThreadSynch.class;
        Class superClass = Thread.class;
        System.out.println(threadSynchClass.getName());
        System.out.println(Arrays.toString(threadSynchClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(threadSynchClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(threadSynchClass.getFields()));
        System.out.println(threadSynchClass.asSubclass(superClass));
        System.out.println(threadSynchClass.getPackage());
    }
}
