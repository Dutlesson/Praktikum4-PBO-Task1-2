/**
 * Circle.java - Task 1.1 Only
 * Modified Circle class dengan constructor baru dan getter/setter
 */
public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // ========== CONSTRUCTORS ==========
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { 
        radius = 1.0;
        color = "red";
    }
    
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { 
        radius = r;
        color = "red";
    }
    
    // TASK 1.1: Constructor baru dengan radius dan color
    /** Constructs a Circle instance with the given radius and color */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // ========== GETTER METHODS ==========
    /** Returns the radius */
    public double getRadius() {
        return radius;
    }
    
    /** Returns the color */
    public String getColor() {
        return color;
    }

    // ========== SETTER METHODS (TASK 1.1) ==========
    /** Sets the radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /** Sets the color */
    public void setColor(String color) {
        this.color = color;
    }

    // ========== OTHER METHODS ==========
    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return a self-descriptive string of this instance */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}