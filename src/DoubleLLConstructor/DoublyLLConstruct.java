package DoubleLLConstructor;

public class DoublyLLConstruct
{
    private Node head;
    private Node tail;
    private int length;
    class Node
    {
        int value;
        Node prev;
        Node next;
        public Node(int value)
        {
           this.value=value;
        }
    }
    public DoublyLLConstruct(int value)
    {
        Node nz=new Node(value);
        head=nz;
        tail=nz;
        length=1;
    }
    public void printListhere()
    {
        Node temp=head;
        System.out.print("List is: ");
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void getHead() {
        System.out.println("Head value: "+head.value);
    }

    public void getTail() {
        System.out.println("Tail value: "+tail.value);
    }

    public void getLength() {
        System.out.println("Length is: "+length);
    }
    public void append(int value)
    {
        Node np=new Node(value);
        if(head==null)
        {
            head=np;
            tail=np;
            length++;
        }
        else
        {
            np.prev=tail;
            tail.next=np;
            tail=np;
            length++;
        }
    }
}
