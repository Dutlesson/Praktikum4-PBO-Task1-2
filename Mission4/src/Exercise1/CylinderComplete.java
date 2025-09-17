/**
 * CylinderComplete.java - Task 1.3 (Complete Implementation)
 * Cylinder class lengkap dengan toString() method
 * REQUIRES: Circle.java dari Task 1.1
 */
public class CylinderComplete extends Circle {
    private double height; // private variable

    // ========== CONSTRUCTORS ==========
    /** Constructor with default color, radius and height */
    public CylinderComplete() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    /** Constructor with default radius, color but given height */
    public CylinderComplete(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    /** Constructor with default color, but given radius, height */
    public CylinderComplete(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }
    
    /** Constructor with radius, height, and color */
    public CylinderComplete(double radius, double height, String color) {
        super(radius, color); // call superclass constructor Circle(radius, color)
        this.height = height;
    }

    // ========== GETTER AND SETTER ==========
    /** A public method for retrieving the height */
    public double getHeight() {
        return height;
    }
    
    /** A public method for setting the height */
    public void setHeight(double height) {
        this.height = height;
    }

    // ========== TASK 1.2: METHOD OVERRIDING ==========
    /**
     * Override getArea() to compute SURFACE AREA of cylinder
     * Surface Area = 2πr×h + 2×base_area
     */
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    /**
     * Fixed getVolume() method using super.getArea() for base area
     */
    public double getVolume() {
        return super.getArea() * height; // super.getArea() = πr² (base area)
    }

    // ========== TASK 1.3: toString() METHOD ==========
    /**
     * TASK 1.3: Override toString() method from superclass Circle
     * Format: "Cylinder: subclass of [Circle info] height=X"
     */
    @Override
    public String toString() {
        // Menggunakan super.toString() untuk mendapatkan info dari Circle
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
    
    // ========== HELPER METHODS ==========
    /** Method untuk mendapatkan base area */
    public double getBaseArea() {
        return super.getArea(); // πr²
    }
    
    /** Method untuk mendapatkan lateral area */  
    public double getLateralArea() {
        return 2 * Math.PI * getRadius() * height; // 2πrh
    }
}