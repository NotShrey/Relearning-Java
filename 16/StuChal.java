
class StackOverflow extends Exception {

    @Override
    public String toString() {
        return "Stack Overflow!";
    }
}

class UnderFlow extends Exception {

    @Override
    public String toString() {
        return "Stack Underflow!";
    }
}

class Stack {

    private final int size;
    private int top = -1, s[];

    public Stack(int size) {
        this.size = size; 
        s = new int[size];
    }

    public void push(int x) throws StackOverflow {
        if (top == size - 1) {
            throw new StackOverflow();
        }
        s[++top] = x;
    }

    public int pop() throws UnderFlow {
        if (top == -1) {
            throw new UnderFlow();
        }
        return s[top--];
    }
}

public class StuChal {

    public static void main(String args[]) {
        Stack s = new Stack(5);
        try {
            s.push(13);
            s.push(16);
            s.pop();
            s.pop();
            s.pop();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
