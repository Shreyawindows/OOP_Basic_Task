public class TrafficLight {
    private String color;
    private int duration;

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Method to change the light color
    public void changeColor(String newColor) {
        color = newColor;
    }

    // Method to get duration
    public int getDuration() {
        return duration;
    }

    // Method to set duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);

        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());

        light.changeColor("green");
        System.out.println("The light is now green: " + light.isGreen());

        System.out.println("The light duration is: " + light.getDuration());

        light.setDuration(20);
        System.out.println("The light duration is now: " + light.getDuration());
    }
}
