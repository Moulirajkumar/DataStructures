package datastructure;

public class Main 
{
	public static void main(String[] args)
	{
		Single_LinkedList sll=new Single_LinkedList();
		sll.insert(12);
		sll.insert(7);
		sll.insert(50);
		sll.insertAtStart(1);
		sll.insertAtStart(2);
		sll.insertAtIndex(2, 3);
		sll.insertAtIndex(3, 4);
		sll.delete(4);
		sll.show();
	}
}
