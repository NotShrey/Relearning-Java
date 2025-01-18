import java.util.Scanner;

public class Armstrong {

    public static int countDigits(int a) {
        int cnt = 0;
        while (a != 0) {
            a /= 10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = s.nextInt();

        int cnt = countDigits(a); 
        int original = a;
        int sum = 0;              


        while (a != 0) {
            int digit = a % 10;
            sum += Math.pow(digit, cnt); 
            a /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        s.close();
    }
}
