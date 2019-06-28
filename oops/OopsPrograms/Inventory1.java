package OopsPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Inventory1 {

	static ObjectMapper mapper = new ObjectMapper();
	public static void main(String[] args) throws JsonProcessingException, IOException {
		// TODO Auto-generated method stub
		filewritejson();
            
	}
	
	public static int countInventory(int weight,int price) 
	{
		int result =0,sum=0;
		result = weight*price;
		sum = sum +result;
		
		return sum;
	}
public static void filewritejson() throws JsonProcessingException, IOException 
{
	ObjectMapper mapper = new ObjectMapper();
	String filename="/home/bridgeit/Desktop/jsonn.json";
	 JsonNode root = mapper.readTree(new File(filename));

	 System.out.println("Rice");
	 JsonNode contactNode = root.path("Rice");
     if (contactNode.isArray()) {


         for (JsonNode node : contactNode) {
             String Name = node.path("name").asText();
             int weight = node.path("Weight").asInt();
             int price = node.path("Price").asInt();
             System.out.println("Name : " + Name);
             System.out.println("weight : " + weight);
             System.out.println("price : " + price);
             int count =countInventory( weight,price) ;
             System.out.println("Price of"+weight+"Kg is: "+count);

         }
         
         System.out.println();
         System.out.println("Wheat");
         JsonNode Wheat = root.path("Wheat");
         if (Wheat.isArray()) {



             for (JsonNode node : Wheat) {
                 String Name = node.path("name").asText();
                 int weight = node.path("Weight").asInt();
                 int price = node.path("Price").asInt();
                 System.out.println("Name : " + Name);
                 System.out.println("weight : " + weight);
                 System.out.println("price : " + price);
                 int count =countInventory( weight,price) ;
                 System.out.println("Price of"+weight+"Kg is: "+count);
             }
             System.out.println("Pulses");
             JsonNode Pulses = root.path("Pulses");
             if (Wheat.isArray()) {

               System.out.println();

                 for (JsonNode node : Pulses) {
                     String Name = node.path("name").asText();
                     int weight = node.path("Weight").asInt();
                     int price = node.path("Price").asInt();
                     System.out.println("Name : " + Name);
                     System.out.println("weight : " + weight);
                     System.out.println("price : " + price);
                     int count =countInventory( weight,price) ;
                     System.out.println("Price of"+weight+"Kg is: "+count);
                 }
     }
	 
   
     }
}
}
}
