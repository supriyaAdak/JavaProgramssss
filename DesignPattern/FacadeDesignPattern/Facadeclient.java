package FacadeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Facadeclient
{
	private static int choice;
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		
		do {
			System.out.println("Mobileshop");
			System.out.println("1.Iphone");
			System.out.println("2.Samsung");
			System.out.println("3.exit");
			System.out.println("enter your choice");
			
		      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	            choice=Integer.parseInt(br.readLine());  
	            Shopkeeper sk=new Shopkeeper();  
		 
		switch (choice)
		{  
        case 1:  
        {   

        	sk.iphonesale();  
            }  
        break;  
        case 2:  
        {  
          sk.samsungSale();        
            }  
        break;    
           
    default:  
    {    
        System.out.println("Nothing You purchased");  
    }         
        return;  
    }  
      
}while(choice!=3);  
 
	
}
}
