import java.util.Scanner;

class multi{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int c = 1;
        s.close();

        while(c <= 10){
            System.out.printf((a * c) + " ");
            c++;
        }
        
        int sum = 0;
        for(int i = 1; i<= a; i++) sum += i;

        System.out.println(sum);
    }
}