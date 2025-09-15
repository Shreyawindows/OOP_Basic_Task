// Circle.java
public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter and Getter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Methods to calculate area and circumference
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create circle with radius 5
        Circle circle = new Circle(5);

        System.out.println("Radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());

        System.out.println();

        // Modify radius to 8
        circle.setRadius(8);

        System.out.println("Radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is now " + circle.getArea());
        System.out.println("The circumference of the circle is now " + circle.getCircumference());
    }
}
