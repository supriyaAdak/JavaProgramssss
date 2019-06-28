package CommercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import Utility.IO;

public class CommercialUserMain {
	
	public static ObjectMapper mapper = new ObjectMapper();
	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
	String	string = "";
	
	ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

	List<CommercialUser > user = new ArrayList<>();

	System.out.println("enter the total no of User");
	int totalUser = IO.Printint();
	int count = 0;
	while(count<totalUser) {
	System.out.println("enter the email id");
	String emailID = IO.Printstring();;
	System.out.println("enter the user name");
	String userName = IO.Printstring();
	System.out.println("enter the phone number");
	long phoneNUMBER = sc.nextLong();
	
	Date current=new Date();
	SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
	String date=simple.format(current);
	
	CommercialUser user1 = new CommercialUser();
	user1.setEmailID(emailID);
	user1.setUserName(userName);
	user1.setPhoneNO(phoneNUMBER);
	user1.setDate(date);
	user.add(user1);
	count++;
	System.out.println("\n");	


}
	try {
		writer.writeValue(new File("/home/bridgeit/Desktop/Userdetails.json"),user);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}
}
