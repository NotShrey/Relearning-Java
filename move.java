import java.util.Scanner;


public class move{

    public static void solveZ(int arr[], int x){
        int tmp = arr[0];

        for(int i=1; i<x; i++){
            arr[i-1] = arr[i];
        }
        arr[x-1] = tmp;
    }
    public static void main(String[] args) {
        int s;
        int[] arr;
        try (Scanner sc = new Scanner(System.in)) {
            s = sc.nextInt();
            arr = new int[s];
            for(int i=0; i<s; i++){
                arr[i]  = sc.nextInt();
            }
        }
        solveZ(arr,s);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}