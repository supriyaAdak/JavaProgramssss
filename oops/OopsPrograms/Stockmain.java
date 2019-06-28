package OopsPrograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import Utility.IO;

public class Stockmain {
	 public static ObjectMapper mapper = new ObjectMapper();
	public static void main(String args[]) 
	{

		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

		List<Stock> stocks = new ArrayList<>();

System.out.println("enter the total no of stocks");
int totalStock = IO.Printint();
int count = 0;
while(count<totalStock) {
System.out.println("enter the name of company");
String shareName = IO.Printstring();
System.out.println("enter the total shares of company");
int totalShare =IO.Printint();
System.out.println("enter the value of each share");
int priceOfEach =IO.Printint();

System.out.println("\n");

Stock stock = new Stock();
stock.setCompanyName(shareName);
stock.setNoOfShares(totalShare);
stock.setEachSharePrice(priceOfEach);
stock.setTotalstockCount(priceOfEach * totalShare);
stocks.add(stock);
 
count++;
		
	}
try {
	writer.writeValue(
			new File("/home/bridgeit/Desktop/Stock.json/"),
			stocks);
} catch (JsonGenerationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (JsonMappingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



Stock_List list = new Stock_List();
list.setStocks(stocks);

for (Stock list1 : list.getStocks()) {
	System.out.println("COMPANY NAME: " + list1.getCompanyName());
	System.out.println("TOTAL SHARES OF COMPANY: " + list1.getNoOfShares());
	System.out.println("PRICE OF EACH SHARE: " + list1.getEachSharePrice());
	System.out.println("TOTAL PRICE OF " + list1.getTotalstockCount() + " is : "
	+ list1.getNoOfShares()*list1.getEachSharePrice() );
	System.out.println("\n");
}
System.out.println("TOTAL VALUE OF STOCK: " + list.getTotalstockvalue());
	
	}
}
