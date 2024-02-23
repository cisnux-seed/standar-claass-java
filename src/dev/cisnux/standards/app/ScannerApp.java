package dev.cisnux.standards.app;

import java.util.Objects;
import java.util.Scanner;

public class ScannerApp {
    public static final Scanner scanner = new Scanner(System.in);

    public static class Person {
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge());
        }
    }

    public static void main(String[] args) {
        System.out.print("Name\t: ");
        final String name = scanner.nextLine();
        System.out.print("Age\t: ");
        final int age = scanner.nextInt();
        final Person person = new Person(name, age);
        System.out.println(person);
        final String a = null;
        System.out.println(a);
    }
}
