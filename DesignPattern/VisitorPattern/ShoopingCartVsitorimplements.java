package VisitorPattern;

public class ShoopingCartVsitorimplements implements ShoppingCartVisitor
{

	@Override
	public int visit(Book book) {
		int cost =0;
		if (book.getPrice()>50) {
			cost = book.getPrice()-10;
			System.out.println("The price of book is:"+cost);
			
			
		}
		else
			cost = book.getPrice();
		System.out.println("book number is:    "+book.getNumber()+"    price is:   "+book.getPrice());

		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPriceperkg()*fruit.getWeight();
		System.out.println("Fruitname:   "+fruit.getFname()+"      fruitTotalPrice:  "+cost);

		return cost;
	}

}
