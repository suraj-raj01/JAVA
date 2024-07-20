class StackImplement {
    int stack[] = new int[5];
    int top = -1;

    // Push Method -> add element into stack.
    public void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow Condition!!!");
        } else {
            top++;
            stack[top] = data;
        }
    }

    // pop Method -> delete element from stack.
    public int pop() {
        int r = -1;
        if (top == -1) {
            System.out.println("Stack Underflow Condition!!!");
        } else {
            r = stack[top];
            top--;
        }
        return r;
    }

    // peek element.
    public int peek() {
        int r = -1;
        if (top == -1) {
            System.out.println("Stack is empty!!!");
        } else {
            r = stack[top];
        }
        return r;
    }

    // isFull:
    public boolean isFull() {
        return top == stack.length - 1 ? true : false;
    }

    // isEmpty:
    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    // display method
    public void show() {
        if (top == -1) {
            System.out.println("Stack is Empty!!!");
        } else {
            System.out.println("Stack values are : ");
            for (int i = stack.length - 1; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackImplement stk = new StackImplement();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.show();
        System.out.println("Peak Element is: " + stk.peek());
        System.out.println("Deleted Element is: " + stk.pop());
        System.out.println("Deleted Element is: " + stk.pop());
        System.out.println("Deleted Element is: " + stk.pop());
        System.out.println("Deleted Element is: " + stk.pop());
        System.out.println("Peak Element is: " + stk.peek());
        System.out.println("Deleted Element is: " + stk.pop());
        // System.out.println("Deleted Element is: "+stk.pop());
        System.out.println("Stack is Empty: " + stk.isEmpty());
        System.out.println("Stack is Full : " + stk.isFull());
    }
}