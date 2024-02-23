package dev.cisnux.standards.app;

public class StringBufferApp {
    public static void main(String[] args) {
        // thread safe
        final StringBuffer stringBuilder = new StringBuffer();
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
