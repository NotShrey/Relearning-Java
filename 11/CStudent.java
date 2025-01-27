
import java.util.Scanner;

class newStu {

    public int rollNo;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total(int a, int b, int c) {
        return a + b + c;
    }

    public double avgr(int a) {
        return a / 3.0;
    }

    public char grade(double x) {
        if (x >= 89) {
            return 'A';
        } else if (x >= 79) {
            return 'B';
        } else if (x >= 69) {
            return 'C';
        } else {
            return 'D';
        }
    }
}

public class CStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rolNo = sc.nextInt();
        sc.nextLine();
        String names = sc.nextLine();
        String courses = sc.nextLine();

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        sc.close();

        newStu s = new newStu();
        s.rollNo = rolNo;
        s.name = names;
        s.course = courses;
        s.m1 = m1;
        s.m2 = m2;
        s.m3 = m3;

        int tot = s.total(m1, m2, m3);
        System.out.println("Total Marks: " + tot);

        double avgrs = s.avgr(tot);
        System.out.println("Average Marks: " + avgrs);

        char c = s.grade(avgrs);
        System.out.println("Grade: " + c);

        System.out.println(s.rollNo);
        System.out.println(s.name);
        System.out.println(s.course);
        

    }
}
