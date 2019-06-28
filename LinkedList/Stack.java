package LinkedList;



public class Stack<T>
{
	int top;
	Node head;


		public  class Node
		{
			T data ;
			Node Next;
		}
		
		
		public boolean isEmpty()
		{
			return head == null? true : false;
		}
		public void push(T data)
		{   Node newnode = new Node();
		    newnode.data=data;
		    if(head == null)
			head = newnode;
			
		else {
			newnode.Next = head;
			head = newnode;
		}
		}
		public int pop () 
		{
		    int ref =0;
			
				if(head == null)
				{
					System.out.println("Stack is empty");
					
				}
				
				else {
				Node n = new Node() ;
				n = head;
				ref =(int) n.data;
				head = head.Next;
		

			
			
			
				}
				return ref;
		}
		public T peek()
		{
			if(head == null) return null;
			return head.data;
			
		}
		 public void show()
		 {
			 Node n = head;
			 while(n.Next != null) 
			 {
				 System.out.println(n.data);
				 n = n.Next;
				 
				 
			 }
			 System.out.println(n.data);
		 }
		
			
}	
		

