abstract class Shape {

    public abstract double peri(); 

    public abstract double area(); 
}

class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double peri() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double test1(){
        return radius;
    }
}

class Rect extends Shape {

    double length, breadth;

    public Rect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double peri() {
        return 2 * (length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

public class StuChallenge {

    public static void main(String[] args) {

        Shape c = new Circle(4);
        System.out.println("Using Shape reference:" + c.area());

        Shape s = new Rect(10, 5);
        System.out.println("Using Shape reference:");
        System.out.println("Perimeter: " + s.peri());
        System.out.println("Area: " + s.area());

        Rect r = new Rect(10, 5);
        System.out.println("\nUsing Rect reference:");
        System.out.println("Perimeter: " + r.peri());
        System.out.println("Area: " + r.area());
    }
}
