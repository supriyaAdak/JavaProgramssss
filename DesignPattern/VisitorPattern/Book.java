package VisitorPattern;

public class Book implements ItemElement {

	private int price;
	private String Number;
	 public Book (int p, String Num) 
	{
		this.Number=Num;
		this.price=p;
		
		
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	
	}

	public int getPrice() {
		return price;
	}



	public String getNumber() {
		return Number;
	}

	

}
