
import java.util.Scanner;


abstract class Shapes {
    }


abstract class TwoD extends Shapes {
    
}


abstract class ThreeD extends Shapes {
    
}


class Square extends TwoD {
    private double side; 

    
    Square(double side) {
        this.side = side;
    }

   
    double area() {
        return side * side;
    }
}


class Triangles extends TwoD {
    private double base;   
    private double height; 

    // Constructor to initialize base and height
    Triangles(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area of the triangle
    double area() {
        return 0.5 * base * height;
    }
}

// Class representing a Cube, extending ThreeD
class Cube extends ThreeD {
    private double side; // Side length of the cube

    // Constructor to initialize the side length
    Cube(double side) {
        this.side = side;
    }

    // Method to calculate the surface area of the cube
    double surfaceArea() {
        return 6 * side * side;
    }
}

// Class representing a Sphere, extending ThreeD
class Sphere extends ThreeD {
    private double radius; // Radius of the sphere

    // Constructor to initialize the radius
    Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate the surface area of the sphere
    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}

// Main class for calculating areas and surface areas of shapes
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for side length of the Square
        System.out.print("Enter side length of the Square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);
        System.out.println("Area of Square: " + square.area());

        // Prompt user for base and height of the Triangle
        System.out.print("Enter base and height of the Triangle: ");
        double triangleBase = scanner.nextDouble();
        double triangleHeight = scanner.nextDouble();
        Triangles triangle = new Triangles(triangleBase, triangleHeight);
        System.out.println("Area of Triangle: " + triangle.area());

        // Prompt user for side length of the Cube
        System.out.print("Enter side length of the Cube: ");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Surface Area of Cube: " + cube.surfaceArea());

        // Prompt user for radius of the Sphere
        System.out.print("Enter radius of the Sphere: ");
        double sphereRadius = scanner.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Surface Area of Sphere: " + sphere.surfaceArea());

        scanner.close();
    }
}
    

