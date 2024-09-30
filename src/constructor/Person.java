package constructor;

public class Person {
    // Static variable
    private static int age = 1;
    // Non-static variable
    private int num = 1;

    // Constructor
    public Person() {
        age++; // Increment static variable
        num++; // Increment non-static variable
    }

    public void printValues() {
        System.out.println("Static age: " + age);
        System.out.println("Non-static num: " + num);
    }
}


