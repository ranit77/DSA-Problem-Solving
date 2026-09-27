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
    public Node removeLast()
    {
        Node temp=null;
        if(length==0)
        {
            return null;
        }
        else if(length==1)
        {
            temp=tail;
            head=null;
            tail=null;
            length--;
            return temp;
        }
        else
        {
            temp=tail;
            tail=tail.prev;
            tail.next=null;
            length--;
        }
        return temp;
    }
    public void prepend(int value)
    {
        Node np=new Node(value);
        if(length==0)
        {
            head=np;
            tail=np;
        }
        else
        {
            np.next=head;
            head=np;
        }
        length++;
    }
    public Node removeFirst()
    {
        Node temp;
        if(length==0)
        {
            return null;
        }
        else if(length==1)
        {
            temp=head;
            head=null;
            tail=null;
        }
        else
        {
            temp=head;
            head=head.next;
            temp.next=null;
            head.prev=null;
        }
        length--;
        return temp;
    }
    public Node getA(int index)
    {
        Node temp;
        if(index<0 || index>=length)
        {
            return null;
        }
        else
        {
           temp=head;
           for(int i=0;i<index;i++)
           {
               temp=temp.next;
           }
        }
        return temp;
    }
    public Node get(int index)
    {
        Node temp;
        if(index<0 || index>=length)
        {
            return null;
        }
        else
        {

           if(index<length/2)
           {
               temp=head;
               for(int i=0;i<index;i++)
               {
                    temp=temp.next;
                }
           }
           else
           {
               temp=tail;
               for(int z=length-1;z>index;z--)
               {
                   temp=temp.prev;
               }
           }
        }
        return temp;
    }
    public boolean set(int index,int value)
    {
        Node temp=get(index);
        if(temp!=null)
        {
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value)
    {
        if(index==0)
        {
            prepend(value);
            return true;
        }
        else if(index==(length-1))
        {
            append(value);
            return true;
        }
        else
        {
            Node na=new Node(value);
            Node temp=get(index);
            Node pre=get(index-1);
            if(temp==null)
            {
                return false;
            }
            pre.next=na;
            na.next=temp;

            temp.prev=na;
            na.prev=pre;
            length++;
            return true;
        }
    }
}
