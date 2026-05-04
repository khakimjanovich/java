package uz.asakabank;

/**
 * Variables in java are classified into `primitives` and `reference variables`
 * Primitives variable information is stored as the value of that variable
 * Reference variable holds a reference to information related to that variable.
 * Refernce variable are objects
 *
 */
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
        System.out.println("first =" + first);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
