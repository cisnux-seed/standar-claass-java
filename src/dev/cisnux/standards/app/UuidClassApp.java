package dev.cisnux.standards.app;

import java.util.UUID;

public class UuidClassApp {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            final UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
