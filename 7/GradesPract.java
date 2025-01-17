
import java.util.Scanner;

public class GradesPract {

    public static void main(String ags[]) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        if (b < 100 && b >= 90) {
            System.out.println("O");
        } else if (b < 90 && b >= 70) {
            System.out.println("E");
        } else if (b < 70 && b >= 60) {
            System.out.println("A");
        } else {
            System.out.println("FaL");
        }
        s.close();
    }
}
