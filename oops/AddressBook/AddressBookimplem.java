package AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Utility.IO;

public class AddressBookimplem implements Manager{


static Scanner sc = new Scanner(System.in);
static String Path="/home/bridgeit/Desktop/";
static ObjectMapper mapper = new ObjectMapper(); 
static String firstName;
static String lastName;
static String bookName;
	public static void addPersonToContact(File file, String firstName, String lastName)
			throws JsonMappingException, IOException {

		
			
		Person person = new Person();
		Address address = new Address();
		Phone phone = new Phone();
		
		System.out.println("Enter street:");
		String street = IO.Printstring();
		System.out.println("Enter city:");
		String city = IO.Printstring();
		System.out.println("Enter State:");
		String state = IO.Printstring();
		System.out.println("Enter zip");
		int zip = IO.Printint();
		System.out.println("Enter mobile number:");
		long phoneNumber = sc.nextLong();
		phone.setMobileNumber(phoneNumber);
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setPhonenumber(phone);
		AddressBookimplem managerr = new AddressBookimplem();
		managerr.save1(person, file);
		
		}
	
	public static void editPerson(String name, File  file) throws JsonMappingException, IOException {
		int count = 0;
		int tempCount = 0;
		String temp = "";
		int stop = 0;
		
		LinkedList<Person> details = mapper.readValue(file,new TypeReference<LinkedList<Person>>() {
				});
		for (Person person : details) {
			if (person.getFirstName().equals(name)) { 
				tempCount = count;
			}
			count++;
		}
		while (stop != 2) {
			System.out.println("1. for edit first name");
			System.out.println("2. for edit last name");
			System.out.println("3. for edit address and phone number");
			count = IO.Printint();
			switch (count) {
			case 1:
				
				System.out.println("Enter new first name :");
				firstName = IO.Printstring();
				details.get(tempCount).setFirstName(firstName); 

				break;
			case 2:
				
				System.out.println("Enter new last name :");
				lastName = IO.Printstring();
				details.get(tempCount).setLastName(lastName); 

				break;
			case 3:
				
				System.out.println("press \n 1. for edit street");
				System.out.println("2. for edit city");
				System.out.println("3. for edit state");
				System.out.println("4 . for edit zip code");
				System.out.println("5 . for edit phone number");
				int choice = IO.Printint();
				if (choice == 1) {
					System.out.println("Enter street:");
					temp = IO.Printstring();
					details.get(tempCount).getAddress().setStreet(temp); 

				}
				if (choice == 2) {
					System.out.println("Enter city:");
					temp = IO.Printstring();
					details.get(tempCount).getAddress().setCity(temp); 


				}
				if (choice == 3) {
					System.out.println("Enter state:");
					temp =IO.Printstring();
					details.get(tempCount).getAddress().setState(temp);

				}
				if (choice == 4) {
					System.out.println("Enter zip:");
					int zip =IO.Printint();
					details.get(tempCount).getAddress().setZip(zip);
					;

				}
				if (choice == 5) {
					System.out.println("Enter mobile number:");
					Long phoneNumber = sc.nextLong();
					details.get(tempCount).getPhonenumber().setMobileNumber(phoneNumber); 

				}
			}
			System.out.println("for stop press 2. or for continue press any number");
			stop =IO.Printint();
		}
		if (stop == 2) {
			
			mapper.writeValue(file,details);
		}
	}


	public static  void save1(Person person, File file) throws JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
		if 
				(file.length() == 0) {
			LinkedList<Person> newPerson = new LinkedList<>();
			newPerson.add(person);
			
			mapper.writeValue(file,newPerson);
			if (file.length() != 0) {
				
				System.out.println("data added successfully");
			} else {
				System.out.println("unsuccessful");
			}
		} else {
			long preFileLength = file.length();
			LinkedList<Person> multiple = mapper.readValue(file,new TypeReference<LinkedList<Person>>() {
					});
			multiple.add(person);
			mapper.writeValue(file,multiple);
			long afterWriteLength = file.length();
			if (preFileLength < afterWriteLength) {
				System.out.println("data added successfully");
			} else {
				System.out.println("data not fill in file");
			}
		}
	}


	

	public static  void delete(String name, File file)throws JsonMappingException, IOException, JsonMappingException, IOException 
	{
		LinkedList<Person> details = mapper.readValue(
				file,
				new TypeReference<LinkedList<Person>>() {
				});
		int count = 0;
		boolean result = true;   
		
		for (Person person : details) {
			if (person.getFirstName().equals(name)) { 
				details.remove(count);
				System.out.println("person successfully removed....");
				mapper.writeValue(
						file,
						details);
			}
			count++;
		}
	
		for (Person person : details) {
			if (person.getFirstName().equals(name)) {
				result = false;
			}
		}
		if (result == true) {
			System.out.println("person successfully removed...");
		}
		
	}

	public  void sortByName(File file) throws JsonMappingException, IOException {
		LinkedList<Person> details = mapper.readValue(
				file,
				new TypeReference<LinkedList<Person>>() {
				});
		LinkedList<String> name = new LinkedList<>();
		int count = 0;
		for (Person person : details) {
			name.add(person.getFirstName());

		}
		
		String names[] = new String[name.size()];

		
		for (String value : name) {
			names[count] = value;
			count++;
		}
		Arrays.sort(names);

		System.out.println("sort by first name");

		
		for (String s : names) {
			int count2 = 0;
			while (count2 < details.size()) {
				if (details.get(count2).getFirstName().equals(s)) {
					System.out.println(details.get(count2));
				}
				count2++;
			}

		}
		
	}

	public  void sortByZip(File file) throws JsonMappingException, IOException {
		LinkedList<Person> details = mapper.readValue(
				file,
				new TypeReference<LinkedList<Person>>() {
				});
		LinkedList<Integer> zip = new LinkedList<>();
		int count = 0;
		for (Person person : details) {
			zip.add(person.getAddress().getZip());

		}
		int zipArray[] = new int[zip.size()];
		for (int value : zip) {
			zipArray[count] = value;
			count++;
		}
		Arrays.sort(zipArray);

		System.out.println("sort by zip");
	

		for (int s : zipArray) {
			int count2 = 0;
			while (count2 < details.size()) {
				if (details.get(count2).getAddress().getZip() == s) {
					System.out.println(details.get(count2));
				}
				count2++;
			}

		}
		
	}


	public void print(File file, String name) throws JsonMappingException, IOException {
		LinkedList<Person> details = mapper.readValue(
				file,
				new TypeReference<LinkedList<Person>>() {
				});
		for (Person person : details) {
			if (person.getFirstName().equals(name)) {
				System.out.println(person);
			}
		}
		
	}
	
	public File createAddressBook(String name) throws IOException {
		String newfile = "";
		 newfile=Path + name + ".json";
		File file = new File(newfile);
		

		boolean result = file.createNewFile();
		if(result==true) 
		{
			System.out.println("Address book is created:");
		}
		else 
		{
			System.out.println("Address book is not  created:");
		}

		return file;

}

public void printFileName() {


}
public static File[] openFile()
{
	File folder = new File(Path);
	return folder.listFiles();
}

public static void printFileNames()
{
	File file[] = openFile(); 
	System.out.println("\nfound json files at mentioned location.   ..select proper :");
	for (File file1 : file) 
	{
		String name = file1.getName();
		if (name.contains(".json")) 
			System.out.println(name); 
	}
	System.out.println();
}

public static void openAddressbook(String addressBookName) throws JsonMappingException, IOException
{
	LinkedList<Person> details = mapper.readValue(new File(Path  + addressBookName),new TypeReference<LinkedList<Person>>() {
			});
	System.out.println(details);

}




}


