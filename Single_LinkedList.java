package datastructure;



public class Single_LinkedList 
{
	Node head;
	public void insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
	}
	public void insertAtStart(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	public void insertAtIndex(int index,int data)
	{
		Node node=new Node(data);
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	public void delete(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			Node n1=n.next;
			n.next=n1.next;
			System.out.println("Deleted Element is: "+n1.data);
			n1.next=null;
		}
	}
	public void show()
	{
		if(head==null)
		{
			System.out.println("No elements Present in this list");
		}
		Node n=head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}
