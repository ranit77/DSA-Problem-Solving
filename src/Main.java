//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
   public static void main(String [] args)
   {
       LLConstructor cons=new LLConstructor(4);
       System.out.println("--Linked List--");
       cons.append(10);
       cons.append(8);
       cons.append(7);
       cons.append(5);
       cons.append(2);
       cons.printList();
       cons.getHead();
       cons.getTail();
       cons.getLength();
       System.out.println("Linked List after deletion");
       LLConstructor.Node l=cons.deleteLast();
       cons.printList();
       cons.getLength();
       System.out.println("Deleted Node value is:"+l.value);
       LLConstructor.Node q=cons.deleteLast();
       cons.printList();
       cons.getLength();
       System.out.println("Deleted Node value is:"+q.value);
       LLConstructor.Node r=cons.deleteLast();
       cons.printList();
       cons.getLength();
       System.out.println("Deleted Node value is:"+r.value);
       System.out.println("After Prepending value");
       cons.prepend(26);
       cons.printList();
       cons.getLength();
       System.out.println("After Prepending value");
       cons.prepend(32);
       cons.printList();
       cons.getLength();
       LLConstructor.Node s=cons.removeFirst();
       cons.printList();
       cons.getLength();
       cons.getHead();
       cons.getTail();
       System.out.println("Removed from beginning: "+s.value);
       LLConstructor.Node d=cons.removeFirst();
       cons.printList();
       cons.getLength();
       cons.getHead();
       cons.getTail();
       System.out.println("Removed from beginning: "+d.value);
         LLConstructor.Node m=cons.get(2);
         System.out.println("Value at required index:"+m.value);
       LLConstructor.Node w=cons.get(4);
       System.out.println("Value at required index:"+q.value);
       LLConstructor.Node p=cons.get(0);
       System.out.println("Value at required index:"+p.value);
       Boolean z=cons.set(2,38);
       System.out.println("Is the operation succesful? "+s);
       cons.printList();
       Boolean t=cons.set(4,46);
       System.out.println("Is the operation succesful? "+t);
       cons.printList();
   }
}
