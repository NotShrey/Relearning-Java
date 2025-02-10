
import java.util.Scanner;

public class merge {

    public static void MergeMe(int arr[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = 0;
        int temp[] = new int[high - low + 1];

        while (i <= mid && j <= high) temp[k++] = (arr[i] < arr[j]) ? arr[i++] : arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= high) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, low, temp.length);

    }

    public static void MergeS(int arr[], int low, int high) {
        int mid;

        if (low < high) {
            mid = (low + high) / 2;
            MergeS(arr, low, mid - 1);
            MergeS(arr, mid + 1, high);
            MergeMe(arr, low, mid, high);
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

        MergeS(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
