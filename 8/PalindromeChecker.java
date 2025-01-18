
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isNumberPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static boolean isStringPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isNumberPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }

        System.out.print("Enter a string: ");
        scanner.nextLine();
        String str = scanner.nextLine();
        if (isStringPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome string.");
        }

        scanner.close();
    }
}
