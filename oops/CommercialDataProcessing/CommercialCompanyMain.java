package CommercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import Utility.IO;

public class CommercialCompanyMain {
	public static ObjectMapper mapper = new ObjectMapper();
	public static void main(String[] args) 
	{
		



	

		String	string = "";
			
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

			List<CommercialCompany > company = new ArrayList<>();

			System.out.println("enter the total no of Company");
			int totalCompany = IO.Printint();
			int count = 0;
			while(count<totalCompany) {
			System.out.println("enter the name of company");
			String shareName = IO.Printstring();
			System.out.println("enter the symbol of company");
			String symbol = IO.Printstring();
			System.out.println("enter the total shares of company");
			int totalShare = IO.Printint();
			System.out.println("enter the value of each share");
			int priceOfEach =IO.Printint();
			Date current=new Date();
			SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyyy");
			String date=simple.format(current);
			
			CommercialCompany comp = new CommercialCompany();
			comp.setCompanyName(shareName);
			comp.setSymbol(symbol);
			comp.setTotalShares(totalShare);
			comp.setEachSharePrice(priceOfEach);
			comp.setDate(date);
			
			company.add(comp);
			count++;
			System.out.println("\n");	
		

	}
			try {
				writer.writeValue(new File("/home/bridgeit/Desktop/CompanyDetailss.json"),company);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
