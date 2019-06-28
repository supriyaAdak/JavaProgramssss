package VisitorPattern;

public class Fruit implements ItemElement {
	private int priceperkg;
	private int weight;
	private String fname;
	
	 public Fruit(int price,int wt,String name)
	{ 
		this.fname=name;
		this.priceperkg=price;
		this.weight=wt;
		
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	public int getPriceperkg() {
		return priceperkg;
	}

	

	public int getWeight() {
		return weight;
	}

	

	public String getFname() {
		return fname;
	}

	

}
