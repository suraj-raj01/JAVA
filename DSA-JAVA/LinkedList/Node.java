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
                System.out.print(temp.data+"\t");
                temp = temp.next;
            }
        }
    }
    public void insertNodeAtPos(Node head,int data,int pos)
	{
	Node newNode = new Node(data);
	pos--;
	Node temp = head;
	Node temp1 = head.next;
	while(pos>1)
	{
	temp = temp.next;
	temp1 = temp1.next;
	pos--;
	}
	temp.next = newNode;
	newNode.next = temp1;
	}
    // delete first node.
    public Node deleteFirst(Node head)
    {
        Node temp = head;
        if(head==null)
        {
            System.out.println("List is empty!!!");
        }
        else{
            temp = head.next;
        }
        return temp;
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
        System.out.println("\nAfter insert data at begning");
        Head.printData(Head);
        Head = Head.addAtEnd(Head, 40);
        System.out.println("\nAfter insert data at ending");
        Head.printData(Head);
        System.out.println("\nAfter insert data at specific position");
        Head.insertNodeAtPos(Head,35,5);
        Head.printData(Head);
        System.out.println("\nAfter delete the first node");
        Head = Head.deleteFirst(Head);
        Head.printData(Head);
    }
}
