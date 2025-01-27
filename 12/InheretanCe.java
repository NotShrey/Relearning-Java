
class Circle{
    public double r;

    public double area(){
        return Math.PI * r * r;
    }

    public double perimeter(){
        return 2 * Math.PI * r;
    }
}

class cylinder extends Circle{
    public double h;

    public double vol(){
        return area() * h;
    }
}


public class InheretanCe {

    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.r = 7;
        c.h = 10;

        System.out.println(c.vol());
    }
}
