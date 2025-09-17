public class TestCylinder {
    public static void main(String[] args) {
        // Test Cylinder instances
        Cylinder c1 = new Cylinder(); // default: radius=1.0, height=1.0, color="red"
        Cylinder c2 = new Cylinder(10.0); // height=10.0, radius=1.0, color="red"  
        Cylinder c3 = new Cylinder(2.0, 10.0); // radius=2.0, height=10.0, color="red"
        Cylinder c4 = new Cylinder(3.0, 5.0, "blue"); // radius=3.0, height=5.0, color="blue"

        System.out.println("=== TESTING TASK 1.2: METHOD OVERRIDING ===");
        System.out.println();
        
        // Test Cylinder 1
        System.out.println("Cylinder 1 (default):");
        System.out.println("  Radius: " + c1.getRadius());
        System.out.println("  Height: " + c1.getHeight());  
        System.out.println("  Color: " + c1.getColor());
        System.out.println("  Base Area (super.getArea()): " + getBaseArea(c1));
        System.out.println("  Surface Area (getArea()): " + c1.getArea());
        System.out.println("  Volume: " + c1.getVolume());
        System.out.println();

        // Test Cylinder 2  
        System.out.println("Cylinder 2 (height=10.0):");
        System.out.println("  Radius: " + c2.getRadius());
        System.out.println("  Height: " + c2.getHeight());
        System.out.println("  Color: " + c2.getColor());
        System.out.println("  Base Area (super.getArea()): " + getBaseArea(c2));
        System.out.println("  Surface Area (getArea()): " + c2.getArea());
        System.out.println("  Volume: " + c2.getVolume());
        System.out.println();

        // Test Cylinder 3
        System.out.println("Cylinder 3 (radius=2.0, height=10.0):");
        System.out.println("  Radius: " + c3.getRadius());
        System.out.println("  Height: " + c3.getHeight());
        System.out.println("  Color: " + c3.getColor());
        System.out.println("  Base Area (super.getArea()): " + getBaseArea(c3));
        System.out.println("  Surface Area (getArea()): " + c3.getArea());
        System.out.println("  Volume: " + c3.getVolume());
        System.out.println();
        
        // Test Cylinder 4
        System.out.println("Cylinder 4 (radius=3.0, height=5.0, color=blue):");
        System.out.println("  Radius: " + c4.getRadius());
        System.out.println("  Height: " + c4.getHeight());
        System.out.println("  Color: " + c4.getColor());
        System.out.println("  Base Area (super.getArea()): " + getBaseArea(c4));
        System.out.println("  Surface Area (getArea()): " + c4.getArea());
        System.out.println("  Volume: " + c4.getVolume());
        System.out.println();

        // Demonstrasi perbedaan Circle vs Cylinder getArea()
        System.out.println("=== DEMONSTRASI POLYMORPHISM ===");
        Circle circle = new Circle(2.0);
        Cylinder cylinder = new Cylinder(2.0, 5.0);
        
        System.out.println("Circle dengan radius 2.0:");
        System.out.println("  getArea() = " + circle.getArea() + " (area lingkaran)");
        System.out.println();
        
        System.out.println("Cylinder dengan radius 2.0, height 5.0:");
        System.out.println("  getArea() = " + cylinder.getArea() + " (surface area)");
        
        // Manual calculation verification
        double expectedSurfaceArea = 2 * Math.PI * 2.0 * 5.0 + 2 * (Math.PI * 2.0 * 2.0);
        System.out.println("  Manual calculation: 2πrh + 2πr² = " + expectedSurfaceArea);
    }
    
    // Helper method untuk mendapatkan base area (menggunakan Cir   cle's getArea)
    private static double getBaseArea(Cylinder c) {
        // Kita buat Circle temporary dengan radius yang sama untuk mendapat base area
        Circle tempCircle = new Circle(c.getRadius());
        return tempCircle.getArea();
    }
}