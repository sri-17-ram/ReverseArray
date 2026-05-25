abstract class Shape {
    abstract void area();  
}
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {
    int length, breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(5);   
        s.area();
        s = new Rectangle(4, 6); 
        s.area();
    }
}
