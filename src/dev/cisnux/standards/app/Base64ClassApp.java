package dev.cisnux.standards.app;

import java.util.Arrays;
import java.util.Base64;

public class Base64ClassApp {
    public static void main(String[] args) {
        final String query = "tutorial java programming";

        for (byte aByte : query.getBytes()) {
            System.out.println((char) aByte);
        }

        final String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);

        final byte[] bytes = Base64.getDecoder().decode(encode);
        System.out.println(Arrays.toString(bytes));
        final String decode = new String(bytes);
        System.out.println(decode);
    }
}
