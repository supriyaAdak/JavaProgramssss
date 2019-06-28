package LinkedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;



public class Linklist <T>
{
	public Node head;
	public class Node
	{
		T data ;
		Node Next;
	}
public  void   show() {
	Node node = head;
	while(node.Next!=null) {
		System.out.println(node.data);
		node=node.Next;
		
	}
//return (int) node.data;
	System.out.println(node.data);

}
	public void InsertNode(T data)
	{
		Node node = new Node ();
		node.data =data;
		node.Next =null;
		if(head == null) {
			head=node;
		}
		else {
			Node n =head;
			while(n.Next!=null) {
				n = n.Next; 
			}
			n.Next = node;
		}
	}
	public void InsertAt(int index, T data) {
		Node node = new Node();
		node.data = data;
		node.Next=null;
		Node n = head;
		for(int i=0;i<index-1;i++) {
			n = n.Next;
			
		}
		node.Next= n.Next;
		n.Next=node;
		
	}
	
	public void Append (T data) {
		Node n= new Node();
		n.data=data;
		n.Next=null;
		Node node=head;
		if(head==null) 
		{
			head = n;
			
		}
		else 
		{
		
			while(node.Next!=null) {
				node = node.Next; 
			}
			node.Next = n;
		}
		
	}
	public void Index(T data) 
	{
		 Node node = new Node();
		 node.data = data;
		 node.Next=null;
		Node n = new Node();
		
		n.Next= head;
		int count =0;
		while(n.data != node.data) {
			n = n.Next; 
			count++;
		}
		System.out.println(count);
	}
	public void Delete(T data)
	{
	 Node n1 = head;
	 Node n2 = n1.Next;
	 if(n1.data.equals(data) )
	 {
		 head = n1.Next;
	 }
	 while(n2.Next!= null && n1.Next!=null) 
	 {
		 if((n2.data).equals(data)){
			 break;
		 
		 }
		 n1 =n1.Next;
		 n2=n2.Next;
	 }
	 n1.Next = n2.Next;
	}
	public int size() 
	{
		Node temp = head;
		int count =0;
		while(temp.Next != null) {
			temp = temp.Next;
			count++;
		}
		return count;
	}
	
	public boolean searchword(T data) 
	{
		
		
        Node n = head;
        if(head == null) {
        	return false;
        }
        while(n.Next!=null)
        {
        	if(n.data.equals(data))
        	{
        		
        		return true;
        		}
        	//
        
        n=n.Next;
	}   
       if(n.data.equals(data)) {
return true;
       }
        		return false;
	

		
		
		
		
	}
	
	public static String[]  fileread()  
	{ 
	    int i=0; 
		String fileName = "/home/bridgeit/Desktop/Supriya/Orderfile.txt";
		File file = new File(fileName);
		String arr[] = new String[fileName.length()];
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		
		while((line = br.readLine()) != null){
		   
			arr = line.split(" ");
		       
		         
		}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		return arr;
		}
	
	//hashing
	
	
	
}
