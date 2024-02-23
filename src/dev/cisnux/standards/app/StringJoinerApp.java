package dev.cisnux.standards.app;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        final String[] names = {"Fajra", "Risqulla", "Cisnux"};
        final StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        for (String name : names) {
            joiner.add(name);
        }
        System.out.println(joiner);
    }
}
