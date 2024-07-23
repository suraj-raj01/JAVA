public class LinkedList {
    int data;
    LinkedList next;
    public
    LinkedList(int data)
    {
        this.data = data;
        this.next = null;
    }
    public LinkedList AddStart(LinkedList head, int data)
    {
        LinkedList newNode = new LinkedList(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public LinkedList AddEnd(LinkedList head,int data)
    {
        LinkedList newNode = new LinkedList(data);
        if(head==null)
        {
            head = newNode;
            return head;
        }
        else{
            LinkedList temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    public void printData(LinkedList head)
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else{
            LinkedList temp = head;
            while (temp!=null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList first = new LinkedList(15);
        LinkedList second = new LinkedList(20);
        LinkedList head = first;
        head.next = second;
        head = head.AddStart(head, 10);
        head.printData(head);
        head = head.AddEnd(head, 25);
        head.printData(head);
    }
}
