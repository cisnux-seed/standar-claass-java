package dev.cisnux.standards.app;

public class StringApp {
    public static void main(String[] args) {
        final String name = "Fajra Risqulla";
        System.out.println(name);
        final String lowerCaseName = name.toLowerCase();
        System.out.println(lowerCaseName);
        final String upperCase = name.toUpperCase();
        System.out.println(upperCase);
        System.out.println("length: " + name.length());
        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("a"));
        final String[] names = name.split(" ");
        for (String item : names) {
            System.out.println(item);
        }
    }
}
