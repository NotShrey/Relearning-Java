import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int last = sc.nextInt(); 
        sc.close();

        int x = 0, y = 1;

        if (last <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (last == 1) {
            System.out.println(x); 
        } else {
            System.out.print(x + " " + y); 
            
            for (int i = 3; i <= last; i++) {
                int tmp = x + y;
                    System.out.print(" " + tmp); 

                x = y;
                y = tmp;
            }
                System.out.println();
        }
    }
}
