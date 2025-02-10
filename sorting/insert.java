
import java.util.Scanner;

public class insert {

    public static void solveI(int arr[]) {
        int key, j;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[];

        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();

            arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }

        solveI(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
