import java.util.Scanner;

public class selection {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void solveS(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) { 
                    minIndex = j; 
                }
            }
            swap(arr,i,minIndex);
        }
    }
    public static void main(String[] args) {
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            } 
        }
        solveS(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
