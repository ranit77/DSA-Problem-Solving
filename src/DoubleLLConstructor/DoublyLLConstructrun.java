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
        n.prepend(89);
        n.prepend(66);
        n.prepend(45);
        n.printListhere();
        n.getLength();
        n.getTail();
        n.getHead();
          DoublyLLConstruct.Node t=n.removeFirst();
          n.printListhere();
          System.out.println("Deleted element: "+t.value);
          n.getHead();
          n.getLength();
          DoublyLLConstruct.Node u=n.removeFirst();
          n.printListhere();
          System.out.println("Deleted element: "+u.value);
          n.getHead();
          n.getLength();
        DoublyLLConstruct.Node a=n.get(0);
        System.out.println("Value is:"+a.value);
        DoublyLLConstruct.Node b=n.getA(3);
        System.out.println("Value is:"+b.value);
        System.out.println("Is it successful?:"+n.set(2,98));
        System.out.println("Is it successful?:"+n.set(0,56));
        n.printListhere();
        n.getTail();
        n.getHead();
        n.getLength();
        System.out.println("Is success??"+n.insert(9,100)); //false -->Out of index range
        System.out.println("Is success??"+n.insert(0,1000));
        n.printListhere();
        n.getHead();
        n.getTail();
        n.getLength();
    }
}
