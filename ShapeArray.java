// ShapeArray.java
public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate objects of Sphere, Cylinder, and Cone
        Shape sphere = new Sphere(5.0);
        Shape cylinder = new Cylinder(3.0, 7.0);
        Shape cone = new Cone(3.0, 5.0);

        // Store objects in an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print details using toString method
        for (Shape shape : shapeArray) {
            System.out.println(shape);
            System.out.println();
        }
    }
}
