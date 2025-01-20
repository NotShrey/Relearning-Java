import java.util.Scanner;

public class test3 {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] insertElement(int[] arr, int ele, int posi) {
        if (posi < 0 || posi > arr.length) {
            throw new IllegalArgumentException("Invalid position: " + posi);
        }

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < posi; i++) {
            newArr[i] = arr[i];
        }

        newArr[posi] = ele;

        for (int i = posi; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static int[] deleteElement(int[] arr, int posi) {
        if (posi < 0 || posi >= arr.length) {
            throw new IllegalArgumentException("Invalid position: " + posi);
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < posi; i++) {
            newArr[i] = arr[i];
        }

        for (int i = posi + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {34, 55, 67, 99, 54};

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("Enter element to insert and its position:");
        int ele = sc.nextInt();
        int posi = sc.nextInt();

        try {
            arr = insertElement(arr, ele, posi);
            System.out.println("Array after insertion:");
            printArray(arr);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter position of element to delete:");
        int delPosi = sc.nextInt();

        try {
            arr = deleteElement(arr, delPosi);
            System.out.println("Array after deletion:");
            printArray(arr);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
