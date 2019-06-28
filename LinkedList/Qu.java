package LinkedList;

public class Qu {
	
	    private static int front, rear, capacity; 
	    public static int queue[]; 
	  
	    public Qu(int c) 
	    { 
	        front = rear = 0; 
	        capacity = c; 
	        queue = new int[capacity]; 
	    } 
	  
	 
	public static void queueEnqueue(int data) 
	    { 
	      
	        if (capacity == rear) { 
	            System.out.printf("\nQueue is full\n"); 
	            return; 
	        } 
	        else { 
	            queue[rear] = data; 
	            rear++; 
	        } 
	        return; 
}
	public static void queueDequeue() 
	    { 
	      
	        if (front == rear) { 
	            System.out.printf("\nQueue is empty\n"); 
	            return; 
	        } 
	  
	        
	        else { 
	            for (int i = 0; i < rear - 1; i++) { 
	                queue[i] = queue[i + 1]; 
	            } 
	  
	          
	            if (rear < capacity) 
	                queue[rear] = 0; 
	  
	        
	            rear--; 
	        } 
	        return; 
	    }
	public static void queueDisplay() 
	    { 
	        int i; 
	        if (front == rear) { 
	            System.out.printf("\nQueue is Empty\n"); 
	            return; 
	        } 
	  
	       
	        for (i = front; i < rear; i++) { 
	            System.out.print( queue[i]); 
	        } 
	        return; 
	    }
	public static void queueFront() 
	    { 
	        if (front == rear) { 
	            System.out.printf("\nQueue is Empty\n"); 
	            return; 
	        } 
	        System.out.printf("\nFront Element is: %d", queue[front]); 
	        return; 
	    } 
}
	   
