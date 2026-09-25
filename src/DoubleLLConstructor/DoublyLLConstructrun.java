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
    }
}
