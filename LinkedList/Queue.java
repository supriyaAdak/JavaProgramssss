package LinkedList;

import LinkedList.Stack.Node;

public class Queue <T>
{	
	
	Node rear ,front;
	int size =0;
	public  class Node
	{
      T data;
	  Node Next;
    }

public boolean isEmpty()
	 {
	 return (size == 0);
	 }
public void enqueue(T data) 
{
	Node n = rear; 
	rear = new Node();
	rear.data=data;	
	rear.Next= null;
	if(isEmpty()) 
	{
		front = rear;
		
	}
	else 
	{
		n.Next= rear;
	}
	size++;
	System.out.println(data+"added");
	
}
public T dequeue () {
	T data = front.data;
	front = front.Next;
	if(isEmpty()) {
		rear = null;
	}
	size--;
	System.out.println(data+"deleted");
	return data;
}
public void show() {
	Node n = front;
	if(front == null)
	{
		System.out.println("Empty queue");
	}
	else 
	{
	while (n.Next!= null)
	{
		System.out.println(n.data);
		n = n.Next;
		
	}
	System.out.println(n.data);
	}
}
public int size()
{
	Node n = front;
	int size =0;
	while (n.Next!= null)
	{
		
		n = n.Next;
		size++;
	}
	
	return size;
}

}
