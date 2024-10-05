// Sphere.java
public class Sphere extends Shape {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Override method to calculate surface area of the sphere
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Override method to calculate volume of the sphere
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // toString method to print surface area and volume
    @Override
    public String toString() {
        return "Sphere: \n" +
                "Surface Area = " + surfaceArea() + "\n" +
                "Volume = " + volume();
    }
}
