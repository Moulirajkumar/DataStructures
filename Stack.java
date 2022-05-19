package datastructure;

public class Stack 
{
	public static void main(String[] args) 
	{
		Main5 st=new Main5();
		st.push(5);
		st.push(15);
		st.push(30);
		//st.pop();
		st.push(50);
		st.push(48);

		System.out.println("Deleted the Element "+st.pop());
		System.out.println("Deleted the Element "+st.pop());
		
		//System.out.println("Deleted the Element "+st.pop());
		System.out.println("The top element is: "+st.peek());
		//st.push(31);
		System.out.println("Deleted the Element "+st.pop());
		System.out.println("Deleted the Element "+st.pop());

		System.out.println("Deleted the Element "+st.pop());
		System.out.println("Deleted the Element "+st.pop());

		System.out.println("Deleted the Element "+st.pop());


		st.show();
	}
}
class Main5
{
	int stack[]=new int[5];
	int top=0;
	public void push(int data)
	{
		if(top==stack.length)
		{
			System.out.println("Stack is Full !!!");
		}
		else
		{
			stack[top]=data;
			top++;
		}
	}
	public int pop()
	{
		int data=0;
		if(isEmpty())
		{
			System.out.println("Stack is Empty !!!");
		}
		else
		{
			top--;
			data=stack[top];
			stack[top]=0;
		}
		return data;
	}
	public void show()
	{
		for(int x:stack)
		{
			System.out.print(x+" ");
		}
	}
	public int peek()
	{
		int data;
		data=stack[top-1];
		return data;
	}
	public boolean isEmpty()
	{
		return top<=0;
	}
	public int size()
	{
		return top;
	}
}
