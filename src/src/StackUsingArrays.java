class Stack {
    static final int Max = 1000;
    int top;
    int a[] = new int[Max];

    boolean isempty() {

        return (top < 0);

    }

   boolean stack() {
        top = -1;
        return true;
    }

    boolean push(int x) {
        if (top >= (Max - 1)) {
            System.out.println("the stack is overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + "pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("the stack is underflow");
            return 0;
        } else {
            int x = a[top--];
            System.out.println(x + "poped from the stack");
            return x;

        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("THE STACK IS UNDERFLOW");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    public boolean isEmpty() {
        return false;
    }
}

class Main {
    public static void main (String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();

    }
}

