/**
 * Task 1.2: Cylinder class dengan method overriding untuk getArea()
 * Cylinder extends Circle
 */
public class Cylinder extends Circle {
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }
    
    // Constructor with radius, height, and color
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // call superclass constructor Circle(radius, color)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    
    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // ========== TASK 1.2: METHOD OVERRIDING ==========
    /**
     * Override getArea() to compute SURFACE AREA of cylinder
     * Surface Area = 2πr×h + 2×base_area
     * Surface Area = 2πr×h + 2×πr²
     */
    @Override
    public double getArea() {
        // Surface area = 2 × π × radius × height + 2 × base area
        // Base area didapat dari parent class menggunakan super.getArea()
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    /**
     * FIXED: getVolume() method - menggunakan super.getArea() untuk base area
     * Volume = base_area × height
     */
    public double getVolume() {
        // SEBELUM: return getArea() * height; // INI SALAH karena getArea() sekarang = surface area
        // SETELAH: gunakan super.getArea() untuk mendapat base area
        return super.getArea() * height; // super.getArea() = area lingkaran = πr²
    }
}