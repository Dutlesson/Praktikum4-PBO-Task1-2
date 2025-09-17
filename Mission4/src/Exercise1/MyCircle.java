public class MyCircle extends Shape {
    private double radius;

    public MyCircle() {
        super();
        this.radius = 1.0;
    }

    public MyCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "MyCircle[radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }
}