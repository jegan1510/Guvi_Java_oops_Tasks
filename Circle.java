package JavaOOps;

public class Circle {
    private double radius;

    // No-arg constructor
    public Circle() {
        radius = 1.0;
    }

    // Constructor with argument
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to test
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Circumference (default): " + c1.calculateCircumference());
        System.out.println("Circumference (custom): " + c2.calculateCircumference());
    }
}

