package dev.cisnux.standards.app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            final Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            final String name = properties.getProperty("database.name");
            final String username = properties.getProperty("database.username");
            final String host = properties.getProperty("database.host");
            final String port = properties.getProperty("database.port");
            System.out.println(name);
            System.out.println(username);
            System.out.println(host);
            System.out.println(port);

            // clear previous keys
            properties.clear();

            // then add a new one
            properties.put("username", "cisnux21");
            properties.put("email", "cisnux@gmail.com");
            properties.put("age", "21");
            properties.store(new FileOutputStream("person.properties"), "Add new person");
        } catch (IOException e) {
            System.out.println("can't read data");
        }
    }
}
