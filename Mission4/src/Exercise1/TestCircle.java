public class TestCircle {
    public static void main(String[] args) {
        // Test default constructor
        Circle c1 = new Circle();
        System.out.println("Circle 1 (default): " + c1.toString());
        System.out.println("Radius: " + c1.getRadius() + ", Color: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());
        System.out.println();

        // Test constructor with radius only
        Circle c2 = new Circle(2.5);
        System.out.println("Circle 2 (radius only): " + c2.toString());
        System.out.println("Radius: " + c2.getRadius() + ", Color: " + c2.getColor());
        System.out.println("Area: " + c2.getArea());
        System.out.println();

        // Test new constructor with radius and color
        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Circle 3 (radius + color): " + c3.toString());
        System.out.println("Radius: " + c3.getRadius() + ", Color: " + c3.getColor());
        System.out.println("Area: " + c3.getArea());
        System.out.println();

        // Test setter methods
        System.out.println("Testing setter methods:");
        c1.setRadius(5.0);
        c1.setColor("green");
        System.out.println("Circle 1 after modification: " + c1.toString());
        System.out.println("New radius: " + c1.getRadius() + ", New color: " + c1.getColor());
        System.out.println("New area: " + c1.getArea());
    }
}