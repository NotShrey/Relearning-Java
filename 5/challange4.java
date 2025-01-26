import java.util.Scanner;

class challange4 {

    public static void main(String arg[]) {

        int a, b, c;
        double ans1, ans2;

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter values: ");
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
        }
        ans1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        ans2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("Roots are: " + ans1 + "and " + ans2);

    }

}
