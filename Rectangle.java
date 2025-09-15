// Rectangle.java
public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Setter methods
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Methods to calculate area and perimeter
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        // Create rectangle with width 12 and height 7
        Rectangle rect = new Rectangle(12, 7);

        // Display initial area and perimeter
        System.out.println("The area of the rectangle is " + rect.getArea());
        System.out.println("The perimeter of the rectangle is " + rect.getPerimeter());

        System.out.println();

        // Modify dimensions
        rect.setWidth(9);
        rect.setHeight(8);

        // Display updated area and perimeter
        System.out.println("The area of the rectangle is now " + rect.getArea());
        System.out.println("The perimeter of the rectangle is now " + rect.getPerimeter());
    }
}
