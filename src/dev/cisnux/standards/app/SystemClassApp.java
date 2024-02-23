package dev.cisnux.standards.app;

public class SystemClassApp {
    public static void main(String[] args) {
        System.out.println(System.getenv("HOME"));
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.gc();
        System.exit(0);
    }
}
