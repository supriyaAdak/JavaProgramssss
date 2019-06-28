package OopsPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Inventory 
{
  public static void main(String args[])
  {  
	 
	  List<Inventoryclass> Rice = new ArrayList<>();
	  Rice.add(new Inventoryclass("kolam", 20, 200) );
	  Rice.add(new Inventoryclass("basmati", 10, 250) );
	  Rice.add(new Inventoryclass("chaval", 10, 300) );
	  Country person = new Country(Rice);
	  person.setInventory(Rice);
	  List<Inventoryclass> wheat = new ArrayList<>();
	  wheat.add(new Inventoryclass("wheat", 20, 200) );
	  wheat.add(new Inventoryclass("green wheat", 10, 250) );
	  wheat.add(new Inventoryclass("pure wheat", 10, 300) );
	  Country person1 = new Country();
	  person1.setInventory(wheat);
	  List<Inventoryclass> Rice1 = new ArrayList<>();
	  Rice1.add(new Inventoryclass("grren peas", 20, 200) );
	  Rice1.add(new Inventoryclass("beans", 10, 250) );
	  Rice1.add(new Inventoryclass("Kidney beans", 10, 300) );
	  Country person2 = new Country(Rice1);
	 List<Country> as = new ArrayList<>();
	 
	 as.add(person);
	 as.add(person1);
	 as.add(person2);
	  try {
		  ObjectMapper mapper=new ObjectMapper();
		 
		//mapper.writeValue(new File("/home/bridgeit/Desktop/sup.json"), as);
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("/home/bridgeit/Desktop/sup.json"), as);
		String File= "/home/bridgeit/Desktop/sup.json";
		List<Country> result;
		result =fileread(File);
		System.out.println(result);
		
	  } catch (JsonGenerationException e) {

		  e.printStackTrace();
		  } catch (JsonMappingException e) {

		  e.printStackTrace();
		  } catch (IOException e) {

		  e.printStackTrace();
		  }
	  //filewrite();
	  //fileread() ;
	//  countryObj.toString();
  }
	  


  

 
 public static List<Country> fileread(String filepath) 
 {
	 
	 ObjectMapper mapper1 = new ObjectMapper();
	 List<Country> value = new ArrayList<>();
	 File fileobj = new File("/home/bridgeit/Desktop/sup.json");
	 try {
		 
			
		 
	
		value = new ArrayList<>(Arrays.asList(mapper1.readValue(fileobj, Country[].class)));
		 
		 
	
		 
	return value;
		
		
		
		 
	 }catch (IOException e) {
		   e.printStackTrace();
		 
	 }
	return null;
 }
}