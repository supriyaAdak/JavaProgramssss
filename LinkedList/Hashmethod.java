package LinkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Hashmethod 

{
	
	//String fileName = "/home/bridgeit/Desktop/Supriya/sup.txt/";
	public static int[] nodeFileReadinghash() throws Exception{

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
	        
	      
	        int[] array1 = new int[10];
	        for(int i=0; i<10; i++) {
	       	 array1[i] = Integer.parseInt(array[i]);
	        }
	     
	        return array1;
	        
	    }
	
	
	
}
