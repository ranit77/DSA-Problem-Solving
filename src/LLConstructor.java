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
}
