/**
 * TestCylinderComplete.java - Task 1.3
 * Test program lengkap untuk semua Task 1.1, 1.2, dan 1.3
 * REQUIRES: Circle.java dan CylinderComplete.java
 */
public class TestCylinderComplete {
    public static void main(String[] args) {
        System.out.println("=== TESTING TASK 1.3: toString() METHOD ===");
        System.out.println();

        // Create test cylinders
        CylinderComplete c1 = new CylinderComplete(); // default
        CylinderComplete c2 = new CylinderComplete(5.0); // height only
        CylinderComplete c3 = new CylinderComplete(3.0, 8.0); // radius + height
        CylinderComplete c4 = new CylinderComplete(2.5, 10.0, "blue"); // all params

        // Test toString() method (Task 1.3)
        System.out.println("=== EXPLICIT toString() CALLS ===");
        System.out.println("c1.toString(): " + c1.toString());
        System.out.println("c2.toString(): " + c2.toString());
        System.out.println("c3.toString(): " + c3.toString());
        System.out.println("c4.toString(): " + c4.toString());
        System.out.println();
        
        // Automatic toString() calls
        System.out.println("=== IMPLICIT toString() CALLS ===");
        System.out.println("c1: " + c1); // otomatis memanggil toString()
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
        System.out.println();
        
        // Comparison with Circle toString()
        System.out.println("=== COMPARISON: Circle vs Cylinder toString() ===");
        Circle circle = new Circle(3.0, "green");
        CylinderComplete cylinder = new CylinderComplete(3.0, 7.0, "green");
        
        System.out.println("Circle toString(): " + circle.toString());
        System.out.println("Cylinder toString(): " + cylinder.toString());
        System.out.println();

        // Complete functionality test
        System.out.println("=== COMPLETE FUNCTIONALITY TEST (ALL TASKS) ===");
        CylinderComplete testCylinder = c3; // radius=3.0, height=8.0
        
        System.out.println("Test Cylinder: " + testCylinder);
        System.out.println("Individual Properties:");
        System.out.println("  Radius: " + testCylinder.getRadius());
        System.out.println("  Height: " + testCylinder.getHeight());
        System.out.println("  Color: " + testCylinder.getColor());
        System.out.println();
        
        System.out.println("Area Calculations:");
        System.out.println("  Base Area (πr²): " + String.format("%.3f", testCylinder.getBaseArea()));
        System.out.println("  Lateral Area (2πrh): " + String.format("%.3f", testCylinder.getLateralArea()));
        System.out.println("  Surface Area (2πrh + 2πr²): " + String.format("%.3f", testCylinder.getArea()));
        System.out.println();
        
        System.out.println("Volume Calculation:");
        System.out.println("  Volume (πr²h): " + String.format("%.3f", testCylinder.getVolume()));
        System.out.println();

        // Test setters with toString()
        System.out.println("=== TESTING SETTERS WITH toString() ===");
        System.out.println("Before modification: " + c1);
        c1.setRadius(4.0);
        c1.setHeight(6.0);
        c1.setColor("yellow");
        System.out.println("After modification: " + c1);
        System.out.println();

        // Polymorphism demonstration
        System.out.println("=== POLYMORPHISM DEMONSTRATION ===");
        System.out.println("Method calls pada object yang sama:");
        System.out.println("- Circle.getArea() → " + circle.getArea() + " (area lingkaran)");
        System.out.println("- Cylinder.getArea() → " + cylinder.getArea() + " (surface area)");
        System.out.println("- super.getArea() di Cylinder → " + cylinder.getBaseArea() + " (base area)");
    }
}