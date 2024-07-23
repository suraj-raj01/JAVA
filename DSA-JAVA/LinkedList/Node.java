public class Node {
    int data;
    Node next;
    public
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    public Node addAtStart(Node head,int d)
    {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public Node addAtEnd(Node head,int d)
    {
        Node newNode = new Node(d);
        if(head == null)
        {
            head = newNode;
            return head;
        }else{
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    public void printData(Node Head)
    {
        if(Head==null)
        {
            System.out.println("List is Empty!!");
        }else{
            Node temp = Head;
            while(temp!=null)
            {
                System.out.println("===>"+temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node Head = first;
        Head.next = second;
        Head.next.next = third;
        Head.printData(Head);
        Head = Head.addAtStart(Head, 5);
        System.out.println("After insert data at begning");
        Head.printData(Head);
        Head = Head.addAtEnd(Head, 40);
        System.out.println("After insert data at ending");
        Head.printData(Head);
    }
}
