package CommercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Utility.IO;

public class StockAccountimplement implements Stock_Interface {
	public static LinkedList<CommercialCompany> data = new LinkedList<>();

	public static LinkedList<Transaction> info = new LinkedList<>();

	public static LinkedList<CommercialUser> user = new LinkedList<>();

	public static CommercialCompany com = new CommercialCompany();

	public static CommercialUser user1 = new CommercialUser();

	public static Transaction info1 = new Transaction();

	public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	public static LocalDateTime now = LocalDateTime.now();

	static ObjectMapper mapper = new ObjectMapper();
    Scanner sc = new Scanner(System.in);
	public void addNew() {
		System.out.println("Insert Company Details");
		System.out.println("Enter company Name:");
		String name = IO.Printstring();

		System.out.println("Enter symbol:");
		String symbol = IO.Printstring();

		System.out.println("Enter total shares :");
		int totalShares = IO.Printint();

		System.out.println("enter value of share :");
		int price = IO.Printint();

		int totalSharePrice = (totalShares) * (price);

		com.setCompanyName(name);
		com.setSymbol(symbol);
		com.setTotalShares(totalShares);
		com.setEachSharePrice(price);
		com.setTotalSharePrice(totalSharePrice);

		String date = (dtf.format(now));
		com.setDate(date);

		saveFile(com);
		System.out.println("data added successfully ");
	}

	public void addNewUser() {
		System.out.println("Insert User Details:");

		System.out.println("Enter emailID Name:");
		String emailID = IO.Printstring();

		System.out.println("Enter USER NAME:");
		String userName = IO.Printstring();

		System.out.println("Enter Phone NUMBER");
		long phoneNO = sc.nextLong();

		user1.setEmailID(emailID);
		user1.setUserName(userName);
		user1.setPhoneNO(phoneNO);
		String date1 = (dtf.format(now));
		user1.setDate(date1);

		saveUserFile(user1);
		System.out.println("data added successfully ");

	}

	public void displayTranscationDetails() throws JsonParseException, JsonMappingException, IOException {
		LinkedList<Transaction> trans = mapper.readValue(new File("/home/bridgeit/Desktop/Transaction.json"),
				new TypeReference<LinkedList<Transaction>>() {
				});

		int i = 0;
		int size = trans.size();
		if (size == 0)
			System.out.println("no data found");
		else {
			System.out.println("\tEmailID\t\t\tshares buy\t\tcompany symbol\t\t\tDate");
			for (i = 0; i < trans.size(); i++) {
				System.out.println("\t" + trans.get(i).getEmailID() + "\t\t  " + trans.get(i).getSharesBuy()
						+ "\t\t\t\t " + trans.get(i).getCompanySymbol() + "\t\t\t  " + trans.get(i).getDate());
				System.out.println("\n");
			}
		}

	}

	public void transcationDetails(String id, String symbol1, int total) {
		try {

			data = mapper.readValue(new File("/home/bridgeit/Desktop/CommercialCompanyData.json"),
					new TypeReference<LinkedList<CommercialCompany>>() {
					});

		} catch (IOException e) {
			e.printStackTrace();
		}
		info1.setEmailID(id);
		info1.setSharesBuy(total);
		info1.setCompanySymbol(symbol1);
		String date1 = (dtf.format(now));
		info1.setDate(date1);

		info.add(info1);
		try {
			mapper.writeValue(new File("/home/bridgeit/Desktop/Transaction.json"), info);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void removeData() {
		try {

			data = mapper.readValue(new File("/home/bridgeit/Desktop/CommercialCompanyData.json"),
					new TypeReference<LinkedList<CommercialCompany>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("enter the SYMBOL of company ");

		String symbol = IO.Printstring();
		int i = 0;
		for (i = 0; i < data.size(); i++) {
			if (i == data.size()) {
				System.out.println("Invalid ");
			} else if (data.get(i).getSymbol().equals(symbol)) {
				data.remove(i);
			}
		}
		try {
			mapper.writeValue(new File("/home/bridgeit/Desktop/CommercialCompanyData.json"), data);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void buyShares(String symbol, int total) {
		try {

			data = mapper.readValue(new File("/home/bridgeit/Desktop/CommercialCompanyData.json"),
					new TypeReference<LinkedList<CommercialCompany>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}

		int i = 0;
		for (i = 0; i < data.size(); i++) {
			if (i == data.size()) {
				System.out.println("Invalid ");
			} else if (data.get(i).getSymbol().equals(symbol)) {

				int update = data.get(i).getTotalShares() - total;
				System.out.println(update);

				data.get(i).setTotalShares(update);
				int updateprice = data.get(i).getEachSharePrice() * update;

				data.get(i).setTotalSharePrice(updateprice);

			}
		}
		try {
			mapper.writeValue(new File("/home/bridgeit/Desktop/CommercialCompanyData.json"), data);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void removeUserData() {
		try {

			user = mapper.readValue(new File("/home/bridgeit/Desktop/Userdetails.json"),
					new TypeReference<LinkedList<CommercialUser>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Enter email id");
		String email = IO.Printstring();
		int i = 0;
		for (i = 0; i < user.size(); i++) {
			if (i == user.size()) {
				System.out.println("Invalid ");
			} else if (user.get(i).getEmailID().equals(email)) {
				user.remove(i);
			}
		}
		try {
			mapper.writeValue(new File("/home/bridgeit/Desktop/Userdetails.json"), user);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void displayInformation() throws JsonParseException, JsonMappingException, IOException {
		LinkedList<CommercialCompany> data1 = mapper.readValue(new File("/home/bridgeit/Desktop/CommercialCompanyData.json"),
				new TypeReference<LinkedList<CommercialCompany>>() {
				});

		int i = 0;
		int size = data1.size();
		if (size == 0)
			System.out.println("\nno data found");
		else {
			System.out.println("Name\t\tsymbol\t\tTotalShares\t\tPrice\t\tTotalSharesValue");
			for (i = 0; i < data1.size(); i++) {
				System.out.println(data1.get(i).getCompanyName() + "\t\t  " + data1.get(i).getSymbol() + "\t\t "
						+ data1.get(i).getTotalShares() + "\t\t\t  " + data1.get(i).getEachSharePrice() + "\t\t  "
						+ data1.get(i).getTotalSharePrice());
			}
		}

	}

	public void displayUserInformation() throws JsonParseException, JsonMappingException, IOException {
		LinkedList<CommercialUser> user = mapper.readValue(new File("/home/bridgeit/Desktop/Userdetails.json"),
				new TypeReference<LinkedList<CommercialUser>>() {
				});

		int i = 0;
		int size = user.size();
		if (size == 0)
			System.out.println("\nno data found");
		else {
			System.out.println("EmailID  \t\t\t\tUserName  \t\tPhoneNumber  \t\t\t\t  Date");
			for (i = 0; i < user.size(); i++) {
				System.out.println(user.get(i).getEmailID() + "  \t\t\t  " + user.get(i).getUserName() + " \t\t\t "
						+ user.get(i).getPhoneNO() + " \t\t\t  " + user.get(i).getDate());
			}
		}

	}

	public void saveFile(CommercialCompany com) {

		try {
			data = mapper.readValue(new File("/home/bridgeit/Desktop/CommercialCompanyData.json"),
					new TypeReference<LinkedList<CommercialCompany>>() {
					});
		} catch (Exception e) {
			e.printStackTrace();

		}
		data.add(com);
		try {
			mapper.writeValue(new File("/home/bridgeit/Desktop/CommercialCompanyData.json"), data);

		} catch (JsonGenerationException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void saveUserFile(CommercialUser user1) {

		try {
			user = mapper.readValue(new File("/home/bridgeit/Desktop/Userdetails.json"),
					new TypeReference<LinkedList<CommercialUser >>() {
					});
		} catch (Exception e) {
			e.printStackTrace();

		}

		user.add(user1);
		try {
			mapper.writeValue(new File("/home/bridgeit/Desktop/Userdetails.json"), user);

		} catch (JsonGenerationException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
