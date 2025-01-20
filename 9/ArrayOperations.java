import java.util.Scanner;

public class ArrayOperations {

    public static int sumAll(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static boolean searchElement(int[] arr, int x) {
        for (int num : arr) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid size. The size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int findMe = sc.nextInt();

        System.out.println("Sum of elements: " + sumAll(arr));
        System.out.println("Element found: " + searchElement(arr, findMe));
        System.out.println("Maximum element: " + findMax(arr));
        System.out.println("Second largest element: " + findSecondMax(arr));

        sc.close();
    }
}
