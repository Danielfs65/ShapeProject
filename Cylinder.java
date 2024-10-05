// Cylinder.java
public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override method to calculate surface area of the cylinder
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Override method to calculate volume of the cylinder
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // toString method to print surface area and volume
    @Override
    public String toString() {
        return "Cylinder: \n" +
                "Surface Area = " + surfaceArea() + "\n" +
                "Volume = " + volume();
    }
}
