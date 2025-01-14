
import java.util.*;

class Challange3 {

    public static float CalcArea(float a, float b) {
        return 0.5f * a * b;
    }

    public static float Calcside(float a, float b, float c) {
        return (a+b+c)/2;
    }

    public static double CalcTA(float s,float a,float b, float c){
        return Math.sqrt(a*((s-a)*(s-b)*(s-c)));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base and height of the triangle: ");
        float a = scanner.nextFloat(); // Base
        float b = scanner.nextFloat(); // Height
        float c = scanner.nextFloat();
        scanner.close();

        // Correct area calculat ion
        float area = CalcArea(a, b) ;
        float side = Calcside(a,b,c);
        double TotalArea = CalcTA(side,a,b,c);

        System.out.println("The area of the triangle is: " + area);
        System.out.println("The sum side of the triangle is: " + side);
        System.out.println("The area of the triangle is: " + TotalArea);
    }
}
