package dev.cisnux.standards.app;

import java.util.Random;

public class RandomClassApp {
    public static void main(String[] args) {
        final Random random = new Random();

        for (int i = 0; i < 100; i++) {
            final int value = random.nextInt(1000);
            System.out.println(value);
        }
    }
}
