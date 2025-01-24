
import java.util.Scanner;

//copying array
//reverse copying array

public class test4 {
    public static void main(String[] args) {
        int size;
        int[] a1, a2;
        try (Scanner sc = new Scanner(System.in)) {
            size = sc.nextInt();
            a1 = new int[size];
            for (int i = 0; i < size; i++) {
                a1[i] = sc.nextInt();
            }
        }

        a2 = new int[size];
        int cnt = 0;
        for(int j = size - 1; j >=0 ;j--){
            a2[j] = a1[cnt++];
        }

        for (int i : a2) {
            System.out.print(i + " ");
        }
    }
}
