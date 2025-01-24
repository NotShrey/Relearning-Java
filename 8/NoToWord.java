
import java.util.Scanner;

public class NoToWord {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), r;
        String s = "";
        sc.close();

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            s += r;
        }
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            switch (c) {
                case '0' -> System.out.print("Zero ");
                case '1' -> System.out.print("One ");
                case '2' -> System.out.print("Two ");
                case '3' -> System.out.print("Three ");
                case '4' -> System.out.print("Four ");
                case '5' -> System.out.print("Five ");
                case '6' -> System.out.print("Six ");
                case '7' -> System.out.print("Seven ");
                case '8' -> System.out.print("Eight ");
                case '9' -> System.out.print("Nine ");
            }
        }
    }
}
