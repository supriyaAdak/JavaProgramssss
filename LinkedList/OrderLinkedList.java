package LinkedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import LinkedList.Linklist.Node;

public class OrderLinkedList <T>
{
	Node head;
	Node tail;
	public class Node {
	 int data;
	 Node next;

	}




	public static int[] nodeFileReading() throws Exception{

	  
	    String fileName = "/home/bridgeit/Desktop/Supriya/sup.txt/";
	    
	    File file = new File(fileName);
	   
	    String line = null;
	    String[] array = new String[ fileName.length()];
	   
	     
	        
	        FileReader fileReader = 
	            new FileReader(file);

	       
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);

	        while((line = bufferedReader.readLine()) != null) {
	        array =line.split(" ");
	           
	        }
	        
	        
	        bufferedReader.close(); 
	        
	        int size = array.length;
	        int[] array1 = new int[size];
	        for(int i=0; i<size; i++) {
	       	 array1[i] = Integer.parseInt(array[i]);
	        }
	     
	        return array1;
	        
	    }
	public int size() {
	Node n = head;
	int counter =1;
	for(int i =0;n.next!=null;i++) {
	n=n.next;
	counter++;
	}
	return counter;
	}
	public String getArray(OrderLinkedList<Integer> list) {
	Node n = head;
	int oldString=0;
	String newString="";
	while(n.next!=null) {
	oldString = n.data;
	newString = newString + oldString + " " ;
	n=n.next;
	}
	oldString =  n.data;
	newString = newString + oldString + " " ;



	return newString;
	}
	public void fileWriter(String contentToWriteinFile) {
	try {
	            
	            String content = contentToWriteinFile;
	  
	            File file = new File("/home/bridgeit/Desktop/Supriya/sup.txt/");
	  
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	             
	            bw.write(content);
	            bw.close();
	  
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }

	}


	public void show() {
	Node node = head;
	while(node.next!=null) {
	System.out.println(node.data);
	node=node.next;
	}
	System.out.println(node.data);
	}
	public void insertorder(int data) {

	Node node = new Node();
	node.data = data;
	node.next = null;

	if(head==null) {
	tail=head=node;
	}
	else {
	Node n= tail;
	n.next=node;
	tail=node;

	}
	}

	public boolean searchNumber(int data) {
	Node n = head;
	if(head == null) {
	return false;
	}
	while(n.next!=null) {

	if(n.data==data) {
	return true;
	}
	n=n.next;
	}
	if((n.data)==(data)) {
	return true;
	}
	return false;
	}
	public void delete(int data) {

	Node n = head;
	Node n1 =n.next;

	while(n1.next!=null && n.next!=null) {
	if((n.data)==(data)) {
	head=n.next;
	break;
	}
	if((n1.data)==(data)) {
	break;
	}
	n=n.next;
	n1=n1.next;
	}
	n.next=n1.next;

	}



	public void sort() {
	Node current = head, index = null;  
	int temp=0;
	  
	if(head == null) {  
	    return;  
	}  
	else {  
	    while(current != null) {  
	        
	        index = current.next;  
	          
	        while(index != null) {  
	          
	            if(current.data > index.data) {  
	                temp = current.data;  
	                current.data = index.data;  
	                index.data = temp;  
	            }  
	            index = index.next;  
	        }  
	        current = current.next;  
	    }      
	}  
	}  


}

