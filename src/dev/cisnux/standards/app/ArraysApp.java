package dev.cisnux.standards.app;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysApp {
    public static void main(String[] args) {
        final String[] names = {"Risqulla", "Cisnux", "Fajra"};

        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        final int index = Arrays.binarySearch(names, "risQulLa", Comparator.comparing(String::toLowerCase));
        System.out.println(index);
        System.out.println(Arrays.toString(names));
        final String[] copiedNames = Arrays.copyOf(names, names.length - 1);
        System.out.println(Arrays.toString(copiedNames));
    }
}
