package VisitorPattern;

import java.util.Iterator;

public class ShoopingcartClient
{
public static void main(String[] args) 
{
	ItemElement [] items = new ItemElement[] 
			{
					new Book(20, "1"),new Book(40, "2"),new Fruit(20, 5, "Apple"),new Fruit(10,50, "Orange")
			
	};
	
	int total = calculatePrice(items);
	System.out.println("total shopping price is :"+total);
	
}

private static int calculatePrice(ItemElement[] items) {
	
	ShoppingCartVisitor visitor = new ShoopingCartVsitorimplements();
	int sum =0;
	for (ItemElement itemElement : items) {
		sum = sum + itemElement.accept(visitor);
	}
	return sum;
}
}
