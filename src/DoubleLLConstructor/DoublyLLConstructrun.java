package DoubleLLConstructor;

public class DoublyLLConstructrun
{
    public static void main(String [] args)
    {
        DoublyLLConstruct n=new DoublyLLConstruct(8);
        n.append(2);
        n.append(4);
        n.append(7);
        n.printListhere();
        n.getHead();
        n.getTail();
        n.getLength();
        DoublyLLConstruct.Node p=n.removeLast();
        n.printListhere();
        System.out.println("Deleted element: "+p.value);
        n.getTail();
        n.getLength();
        DoublyLLConstruct.Node r=n.removeLast();
        n.printListhere();
        System.out.println("Deleted element: "+r.value);
        n.getLength();
        n.getTail();
    }
}
