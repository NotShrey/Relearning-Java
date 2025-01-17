import java.util.Scanner;

public class WebSite {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the website URL:");
        String s1 = s.nextLine();


        String protocol = s1.substring(0, s1.indexOf(":")).toUpperCase();

        if (protocol.equals("HTTPS")) {
            System.out.println("G");
        } else {
            System.out.println("B");
        }

        String domain = s1.substring(s1.lastIndexOf('.') + 1);

        // Check the domain type
        if (domain.equals("com")) {
            System.out.println("GG");
        } else {
            System.out.println("BB");
        }

        s.close(); // Close the scanner
    }
}
