// Person.java
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Print method
    public void printInfo() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person("Ean Craig", 11);
        Person person2 = new Person("Evan Ross", 12);

        // Print initial info
        person1.printInfo();
        person2.printInfo();

        System.out.println("\nSet new age and name:");

        // Update info
        person1.setAge(14);
        person2.setName("Lewis Jordan");

        // Print updated info
        System.out.println(person1.name + " is now " + person1.age + " years old.");
        System.out.println(person2.name + " is now " + person2.age + " years old.");
    }
}
