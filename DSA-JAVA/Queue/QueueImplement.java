public class QueueImplement {
    int front = -1;
    int rear = -1;
    int queue[] = new int[5];

    // Insert Data into the queue
    public void enq(int data) {
        if (rear == queue.length - 1) {
            System.out.println("Overflow  Condition!!!");
        } else {
            if (front == -1 && rear == -1) {
                front++;
                rear++;
                queue[rear] = data;
            } else {
                rear++;
                queue[rear] = data;
            }
        }
    }

    // Delete Data from the queue.
    public int deq() {
        int r = -1;
        if (front == -1 && rear == -1) {
            System.out.println("Underflow Condition!!!");
        } else {
            if (front == rear) {
                r = queue[front];
                front = rear = -1;
            } else {
                r = queue[front];
                front++;
            }
        }
        return r;
    }

    // peek element Method
    public int peek() {
        if (front == -1 && rear == -1) {
            return -1;
        }
        return queue[front];
    }

    // display method
    public void display() {
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    // check isEmpty
    public boolean isEmpty() {
        return rear == -1 && front == -1 ? true : false;
    }

    // check isFull
    public boolean isFull() {
        return rear == queue.length - 1 ? true : false;
        // if(rear==queue.length-1)
        // {
        // return true;
        // }
        // return false;
    }

    public static void main(String[] args) {
        QueueImplement q = new QueueImplement();
        q.enq(10);
        q.enq(20);
        q.enq(30);
        q.enq(40);
        System.out.println("Is Queue Full : " + q.isFull());
        q.enq(50);
        System.out.print("Stack Element is: ");
        q.display();
        System.out.println("\nIs Queue Full : " + q.isFull());
        System.out.println("----------------------");
        System.out.println("Deleted Element: " + q.deq());
        System.out.println("Deleted Element: " + q.deq());
        System.out.println("Deleted Element: " + q.deq());
        System.out.println("Deleted Element: " + q.deq());
        System.out.println("Peek Element is: " + q.peek());
        System.out.println("Is Queue empty : " + q.isEmpty());
        System.out.println("Deleted Element: " + q.deq());
        System.out.println("Is Queue Empty: " + q.isEmpty());
    }
}
