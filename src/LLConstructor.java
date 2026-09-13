public class LLConstructor {
    private Node head;
    private Node tail;
    private int length;
    Node deletedNode;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LLConstructor(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head at: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail at:" + tail.value);
    }

    public void getLength() {
        System.out.println("Length is:" + length);
    }

    public void printList() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void append(int value) {
        Node nodeZ = new Node(value);
        if (head == null && tail == null) {
            head = nodeZ;
            tail = nodeZ;
        } else {
            tail.next = nodeZ;
            tail = nodeZ;
        }
        length++;
    }
    public Node deleteLast() {
        Node temp;
        temp = head;
        deletedNode = tail;
        if (head == null && tail == null) {
            return null;
        }
        else if (length > 1)
        {
            while (temp != tail) {
                if (temp.next == tail) {
                    tail = temp;
                    tail.next = null;
                    break;
                }
                temp = temp.next;
            }
            length--;
        }
        else if(head==tail)
        {
            head=null;
            tail=null;
            length--;
        }
        return deletedNode;
    }
    public void prepend(int value)
    {
        Node temp;
        temp=head;
        Node nodeQ = new Node(value);
        if (head == null && tail == null) {
            head = nodeQ;
            tail = nodeQ;
        }
        else {
          head=nodeQ;
          head.next=temp;
        }
        length++;
    }
    public Node removeFirst()
    {
          Node delFirst;
          delFirst=head;
        if (head == null && tail == null) {
            return null;
        }
        else if(length>1)
        {
           head=head.next;
           length--;
        }
        else if(head==tail)
        {
            head=null;
            tail=null;
            delFirst=null;
            length--;
        }
        return delFirst;
    }
    public Node get(int index)
    {
        Node temp;
        temp=head;
        if(index<0 || index>=length)
        {
            return null;
        }
        for(int i=0;i<=index;i++)
        {
            if(i==index)
            {
                break;
            }
            temp=temp.next;
        }
        return temp;
    }
    public Boolean set(int index,int value)
    {
        Node temp;
        temp=head;
        if(index<0 || index>=length)
        {
            return false;
        }
        else
        {
            for(int i=0;i<index;i++)
            {
                temp=temp.next;
            }
            temp.value=value;
        }
        return true;
    }
    public boolean insert(int index,int value) {

        Node temp = get(index);
        if(temp==null)
        {
            return false;
        }
        Node aft = temp.next;
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        }
        else {
            if (temp != null)
            {
                Node nz = new Node(value);
                temp.next = nz;
                nz.next = aft;
                length++;
                return true;
            }
        }
        return false;
    }
}