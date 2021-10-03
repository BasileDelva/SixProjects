package core;
import java.util.LinkedList;
public class Stack {
	private java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();
	
	public Stack() {}
	
	public Stack(int firstNode)
	{
		list.push(firstNode);
	}
	
	public int getSize()
	{
		return list.size();
	}
	
	//IS empty
	public boolean isEmpty()
	{
		return list.size() == 0;
	}
	
	public void push(int node)
	{
		list.addLast(node);
	}
	
	public int pop()
	{
		if (isEmpty())
			System.out.println("THE LIST IS EMPTY!");
		return list.removeLast();
	}
	
	public int peek()
	{
		if (isEmpty())
			System.out.println("THE LIST IS EMPTY!");
		return list.peekLast();
	}
	
}