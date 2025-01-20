import java.util.Scanner;

public class test2 {

    public static void leftShift(int[] arr, int size) {
        int tmp = arr[0];
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        arr[size - 1] = tmp;
    }

    public static void rightShift(int[] arr, int size) {
        int tmp = arr[size - 1];
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = tmp;
    }


    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before shifting:");
        printArray(arr);

        leftShift(arr, size);
        System.out.println("Array after left shift:");
        printArray(arr);

        rightShift(arr, size);
        System.out.println("Array after right shift:");
        printArray(arr);
        
        rightShift(arr, size);
        System.out.println("Array after right shift:");
        printArray(arr);

        sc.close();
    }
}
