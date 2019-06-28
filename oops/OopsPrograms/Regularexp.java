package OopsPrograms;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Utility.IO;

public class Regularexp 
{
	public static void main(String args[]) throws JsonProcessingException, IOException 
{ 
		ObjectMapper mapper = new ObjectMapper();
		String filename="/home/bridgeit/Desktop/reg.json";
		 JsonNode root = mapper.readTree(new File(filename));
		 String values = "message";
		 JsonNode message = root.path(values);
		
		 String mess=message.asText();
		 System.out.println(mess);
		 System.out.println("enter your First name");
		 String input =IO.Print();
		
		
		 if(Pattern.matches("[a-zA-Z]", input)) 
		 {
			
			 mess= mess.replaceAll("<<name>>", input);
			System.out.println(mess);
		 }
		 
		 System.out.println("enter your Full name");
		 String FullName = IO.Print();
		 if(Pattern.matches("[a-zA-Z]", FullName)) 
		 {
			 
			 mess= mess.replaceAll("<<full name>>", FullName);
			System.out.println(mess);
		 }
		 
		 else 
		 {
			 System.out.println("Enter valid data");
		 }
		 System.out.println("Enter the Mobile no");
		 String Mno = IO.Printstring();
		 if(Pattern.matches("[789]{1}\\d{9}", Mno)) 
		 {
			 mess= mess.replaceAll("xxxxxxxxxx", Mno);
		 }
		 Date currentdate = new Date();
		 SimpleDateFormat formatter= new SimpleDateFormat("MM-dd-yyyy");
		 String date = formatter.format(currentdate);
		 System.out.println(formatter.format(currentdate));
		 if(Pattern.matches("^((0|1)\\d{1})-((0|1|2)\\d{1})-((19|20)\\d{2})", date)) 
		 {
			 mess= mess.replaceAll("dd/mm/yyyy", date);
		 }
		 System.out.println(mess);
}

	
}
