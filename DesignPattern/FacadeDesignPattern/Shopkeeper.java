package FacadeDesignPattern;

public class Shopkeeper 
{
	private MobileShop iphone;
	private MobileShop samsung;
	
	public Shopkeeper()
	{
		 iphone = new Iphone();
		samsung = new Samsung();
		
		
		
	}
	public void iphonesale() 
	{
       iphone.ModelNo();
       iphone.price();
		
	}
	public void samsungSale() 
	{
		samsung.ModelNo();
		samsung.price();
		
	}

}
