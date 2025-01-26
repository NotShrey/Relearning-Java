
class circle1 {

    private double rad;

    public double getRad(){
        return rad;
    }

    public void SetRad(double x){
        rad = x;
    }

    public double area() {
        return Math.PI * rad * rad;
    }

    public double Parameter() {
        return 2 * Math.PI * rad;
    }
}

public class classes {

    public static void main(String[] args) {
        circle1 c = new circle1();
        System.out.println(c.getRad());
        c.SetRad(5);
        double val = c.area();
        double val2 = c.Parameter();
        System.out.println(val + " " + val2);
        System.out.println(" ");
        circle1 c2 = new circle1();
        c2.SetRad(7);
        double val3 = c2.area();
        double val23 = c2.Parameter();
        System.out.print(val3 + " " + val23);
    }
}
