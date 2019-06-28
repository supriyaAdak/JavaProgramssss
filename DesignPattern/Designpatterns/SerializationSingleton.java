package Designpatterns;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SerializationSingleton 
{
	public static void main(String[] args) 
	{
		try
	     { 
			 Singletn instance1 = Singletn.instance; 
	         ObjectOutput out = new ObjectOutputStream(new FileOutputStream("/home/bridgeit/Desktop/Supriya/Serialization.txt"));
	         out.writeObject(instance1); 
	         out.close(); 
	   
	         // deserailize from file to object 
	         ObjectInput in  
	             = new ObjectInputStream(new FileInputStream("/home/bridgeit/Desktop/Supriya/Serialization.txt")); 
	           
	         Singletn instance2 = (Singletn) in.readObject(); 
	         in.close(); 
	   
	         System.out.println(instance1.show()); 
	         System.out.println("instance2 hashCode:- " 
	                                              + instance2.hashCode()); 
	     }  
	       
	     catch (Exception e)  
	     { 
	         e.printStackTrace(); 
	     } 
	}
	 

}
class Singletn implements Serializable
{
    public static Singletn instance = new Singletn(); 
    
    private Singletn()  
    { 
        // private constructor 
    } 
    public String show() {
    	String sw ="display output";
    	System.out.println(sw);
		return sw;
    }
}