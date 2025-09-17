public class    TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape s1 = new Shape();
        System.out.println(s1.toString());

        Shape s2 = new Shape("blue", false);
        System.out.println(s2.toString());

        // Test MyCircle
        MyCircle c1 = new MyCircle();
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        MyCircle c2 = new MyCircle(2.5, "yellow", true);
        System.out.println(c2.toString());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());

        // Test Rectangle
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(2.0, 4.0, "red", false);
        System.out.println(r2.toString());
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        // Test Square
        Square sq1 = new Square();
        System.out.println(sq1.toString());

        Square sq2 = new Square(3.0, "purple", true);
        System.out.println(sq2.toString());
        System.out.println("Area: " + sq2.getArea());
        System.out.println("Perimeter: " + sq2.getPerimeter());

        // Uji setSide
        sq2.setSide(5.0);
        System.out.println("After setSide(5.0): " + sq2.toString());
    }
}