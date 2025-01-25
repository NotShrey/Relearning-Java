import java.util.Scanner;

public class IsP {

    public static int Solve(int a) {
        if (a <= 1) return 0;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if (Solve(a) == 1) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }
    }
}
