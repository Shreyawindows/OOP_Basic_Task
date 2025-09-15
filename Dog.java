// Dog.java
public class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Print method
    public void printInfo() {
        System.out.println(name + " is a " + breed + ".");
    }

    public static void main(String[] args) {
        // Create Dog objects
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");

        // Print initial info
        dog1.printInfo();
        dog2.printInfo();

        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");

        // Update attributes
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");

        // Print updated info
        System.out.println(dog1.name + " is now a " + dog1.breed + ".");
        System.out.println(dog2.name + " is now a " + dog2.breed + ".");
    }
}
