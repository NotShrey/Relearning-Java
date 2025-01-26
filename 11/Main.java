class Example {
    int x;

    Example() {
        System.out.println("Default const");
    }

    Example(int value) {
        x = value;
    }

    void display() {
        System.out.println("Method called! Value of x: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(10);
        obj.display();
        System.out.println(obj.x);
    }
}
