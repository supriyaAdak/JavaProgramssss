package AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Utility.IO;

public class AddressBookmanager 
{



	public static void main(String args[]) throws IOException 
	{
		AddressBookimplem address = new AddressBookimplem();
		 
		 String addressBookName ="";
		 File file=	address.createAddressBook(addressBookName);
		 int choice =0;
			do {
		System.out.println("1.create address book /n 2.open /n 3.delete/n 4 save");
		System.out.println("Enter your choice ");
		 choice = IO.Printint();

		 switch(choice)
		{
		
		
		case 1:
			
			try {
				System.out.println("Enter your file name ");
				 addressBookName= IO.Printstring();
	          file=	address.createAddressBook(addressBookName);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			break;
			
		case 2 :
			System.out.println("open your file ");
		    System.out.println("Enter your file name ");
		  
		    addressBookName = IO.Printstring();
			  try {
				address.openFile();
				System.out.println("1.Add people to contact /n 2.Modify /n 3.sort by name /n sort by zip code/n 4 print");
				System.out.println("Enter your choice ");
				int choice1 = IO.Printint();
				switch(choice1)
				{	
				case 1: 
					System.out.println("Enter firstName Name");
				
					String firstName = IO.Printstring();

					System.out.println("Enter lastName Name");
					String lastName = IO.Printstring();
					address.addPersonToContact(file, firstName, lastName);
					break;
				case 2:
					      System.out.println("Enter the FirstName");
				          firstName= IO.Print();
				        
				        
				          address.editPerson(firstName,file);
				          break;
				
			  
				case 3:  
					System.out.println("1.sort by Name"
							+ "\n2.sort by Zip"
							+ "\n3.Enter the choice:");
					choice = IO.Printint();
					
					if(choice==1) 
					{
						address.sortByName(file);
					}
					if(choice==2)
					{
						address.sortByZip(file);
					}
					break;
				case 4:
					System.out.println("Enter the FirstName");
					firstName=IO.Print();
					address.print(file,firstName);
					break;
				case 5:
					System.exit(0);
					break;
			
				}
			  }
				catch (JsonMappingException e)
			  {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			  catch (IOException e) 
			  {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		case 3:
			System.out.println("Delete  person details... ");
			System.out.println("Enter first name of person  which you want to removed from a list ");
			String name = IO.Printstring();
			address.delete(name, file);
				break; 
}
			}while(choice <= 3 && choice > 0);
	}
}
			

