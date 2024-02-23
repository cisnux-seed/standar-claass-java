package dev.cisnux.standards.app;

public class StringBuilderApp {
    public static void main(String[] args) {
        // non thread safe
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Fajra")
                .append(' ')
                .append("Risqulla")
                .append(' ')
                .append("cisnux")
                .append(21);
        final String fullName = stringBuilder.toString();
        System.out.println(fullName);
    }
}
