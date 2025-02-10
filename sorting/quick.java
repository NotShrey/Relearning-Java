import java.util.Scanner;

public class quick {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int p = arr[low]; 
        int i = low + 1;
        int j = high;

        while (true) {
            while (i <= high && arr[i] <= p) {
                i++;
            }

            while (arr[j] > p) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            } else {
                break;
            }
        }

        swap(arr, low, j);
        
        return j;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr;

        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
        }

        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
