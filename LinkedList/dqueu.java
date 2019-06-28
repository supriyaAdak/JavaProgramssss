package LinkedList;




public class dqueu <T>
	{
		


			Node front = null;
			Node rear = null;


			public class Node {
			 char data;
			 Node next;

			}

			public void insertElementsatRearEnd(char data) {

			Node node = new Node();
			node.data= data;
			node.next=null;
			if(front==null && rear == null) {
			front = rear = node;
			}

			Node n = rear;
			n.next=node;
			rear=node;
			}	
			public void show() {
			if(front==null && rear == null) {
			System.out.println("list is empty");
			}

			else {
			Node n = front;
			while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;

			}
			System.out.println(n.data);


			}
			}

			public int size() {
			Node n = front;
			int counter = 1;
			while(n.next!=null) {
			n=n.next;
			counter++;
			}

			return counter;




			}



			public void insertElementsatFront(char data) {
			Node node = new Node();
			node.data= data;
			node.next= null;

			if(front==null && rear == null) {
			front=rear=node;
			}
			else {
			Node n = front;
			node.next=n;
			front=node;
			}
			}

			public char removeFromEnd() {
			char b = 0;
			if(front==null && rear == null) {
			System.out.println("empty");
			}
			else if(front == rear) {
			Node n = front;
			char a = n.data;
			front = rear = null;
			return a;

			}
			else {
			Node n = front;
			Node m = n.next;

			while(m.next!=null) {
			n=n.next;
			m=m.next;
			}
			b = m.data;
			rear=n;
			n.next=null;
			m=null;
			}
			return b;

			}

			public int removeFromFront() {
			Node n = front;
			int a = (int) n.data;
			n=n.next;
			front = n;

			return a;

			}





	




}
