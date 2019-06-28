package CommercialDataProcessing;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import Utility.IO;

public class CdpMain {

	public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException
	{
	StockAccountimplement stock = new StockAccountimplement();

	int choice = 0 ;

	do {
		System.out.println("Stock Management");
		System.out.println("1.Add data to the company list");
		System.out.println("2.Add data to the user list");
		System.out.println("3.Remove data from the company list");
		System.out.println("4.Remove data from the user list");
		System.out.println("5.display list of company");
		System.out.println("6.display list of user");
		System.out.println("7.buy using company symbol");
		System.out.println("8.Transaction details");
		System.out.println("9.Exit");
		System.out.println("\n");
		System.out.println("enter the choice");
		choice = IO.Printint();
		switch (choice) {
		case 1:
			// add company information

			stock.addNew();

			break;
		case 2:
			// add user information

			stock.addNewUser();

			break;
		case 3:
			// removing data from the company list
			stock.removeData();
			System.out.println("data removed successfully....");
			break;
		case 4:

			// removing data from user list
			stock.removeUserData();
			System.out.println("data removed successfully....");
			break;

		case 5:
			// displaying company information
			stock.displayInformation();
			break;
		case 6:
			// displaying user information
			stock.displayUserInformation();
			break;
		case 7:

			System.out.println("enter the email id of user who wants to buy");
			String id = IO.Printstring();
			System.out.println("Enter the company symbol");
			String symboll = IO.Printstring();

			System.out.println("enter how many share you want to buy");
			int total = IO.Printint();

			stock.buyShares(symboll, total);
			stock.transcationDetails(id, symboll, total);
			
			System.out.println("transaction successful");
			break;

		case 8:
			stock.displayTranscationDetails();
			break;
		case 9:

			System.out.println("Exit");
			
			break;

		default:
			System.out.println("Invalid:");

		}

	} while (choice <= 8 && choice > 0);
}
}