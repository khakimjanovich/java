package uz.asakabank;

public class PrimitiveReferenceDemo {
    public static void main(String[] args) {
        int age = 25;
        int copiedAge = age;
        copiedAge = 30;

        System.out.println("age = " + age);
        System.out.println("copiedAge = " + copiedAge);

        Person first = new Person("Ali");
        Person second = first;
        second.name = "Vali";

        System.out.println("first.name = " + first.name);
        System.out.println("second.name = " + second.name);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
