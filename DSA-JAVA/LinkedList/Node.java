public class Node {

    int data;
    Node next;
    public
    Node(int data)
    {
        this.data = data;
        this.next = null;
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
                System.out.println("==>"+temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node Head = first;
        Head.next = second;
        Head.next.next = third;
        Head.next.next.next = fourth;
        Head.printData(Head);
    }
}
