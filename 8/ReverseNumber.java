import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = s.nextInt();

        int org = a, reversed = 0;

        while (org != 0) {
            int digit = org % 10;        
            reversed = reversed * 10 + digit;
            org = org / 10;             
        }

        System.out.println("Reversed number: " + reversed);

        s.close();
    }
}
