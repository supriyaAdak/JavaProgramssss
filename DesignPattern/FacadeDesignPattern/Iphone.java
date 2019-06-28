package FacadeDesignPattern;

public class Iphone implements MobileShop
{

	@Override
	public void ModelNo()
	{
	System.out.println("Iphone6");
		
	}

	@Override
	public void price() {

		System.out.println("5000");
	}

	
}
