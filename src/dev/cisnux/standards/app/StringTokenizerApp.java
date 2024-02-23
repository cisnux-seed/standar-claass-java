package dev.cisnux.standards.app;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        final String name = "Fajra Risqulla Cisnux";
        final StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while (tokenizer.hasMoreTokens()) {
            final String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
