import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. The array size must be greater than 0.");
            sc.close();
            return;
        }

        int a[] = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < a.length; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer:");
                sc.next(); // Clear invalid input
            }
            a[i] = sc.nextInt();
        }
        
        int b[] = {45, 64, 67, 44, 33};


        System.out.print("Array elements: ");
        for (int element : a) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}
