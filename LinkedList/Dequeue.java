package LinkedList;

import LinkedList.Queue.Node;

public class Dequeue<T>
{
	Node rear;
	Node front;
	int size=0;
  public static class Node<T>
  {
	  T data ;
	  Node next = null;
	  
  }
  
  public void insertatrear(int item)
  {
	 Node node = new Node ();
	 node.data =item;
	 node.next=null;
	 
	Node n = rear;
	if(front==null&&rear==null)
	{
		front=rear = node;
		
		
	}
	else 
	{
		n.next=node;
		rear=node;
	
		
	}
  }
  public void insertatfront(int item)
  {
	 Node node = new Node ();
	 node.data =item;
	 node.next=null;
	 
	  Node n = front;
	
		node.next=n;
		front=node;
		
		
	
  }
  public int removeend() 
  {
	 Node f = front;
	 Node l = rear;
	 int a =(int) f.data;
	while(f.next!=l) 
	{
	  f= f.next;
	}  
	  f.next=null;
	  rear=f;
	  return a;
  }
  public int removefront() 
  {
	  Node n =front;
	  int a = (int) n.data;
	  n=n.next;
	  front=n;
	  return a;
  }
   public int Size() 
   {
	   int count =0;
	   Node f= front;
	   Node l = rear;
	   while(f.next!=l)
	   {
		   f=f.next;
		   count++;
		   
	   }
	   count++;
	   return count;
	   
   }
  public void show() {
		Node n = front;
		if(front == null&& rear==null)
		{
			System.out.println("Empty queue");
		}
		else 
		{
		while (n.next!= null)
		{
			System.out.println(n.data);
			n = n.next;
			
		}
		System.out.println(n.data);
		}
	}
  public boolean isEmpty()
	 {
	 return (size == 0);
	 }
}
