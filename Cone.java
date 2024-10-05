// Cone.java
public class Cone extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override method to calculate surface area of the cone
    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    // Override method to calculate volume of the cone
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    // toString method to print surface area and volume
    @Override
    public String toString() {
        return "Cone: \n" +
                "Surface Area = " + surfaceArea() + "\n" +
                "Volume = " + volume();
    }
}
