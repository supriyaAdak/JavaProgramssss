package OopsPrograms;

public class Inventoryclass 
{

	private String name;
	private int weight;
	private int price;
	public Inventoryclass(){}
	public Inventoryclass(String name, int weight, int price){
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public String getName()
	    {
		  return name;
		 }
	 public void setName(String name) 
	     {
		  this.name = name;
		 }
	
	public int getWeight()
	    {
		  return weight;
		 }
	 public void setWeight(int weight) 
	     {
		  this.weight = weight;
		 }
	 public int getPrice()
	     {
		  return price;
		 }
		 
		 public void setprice(int price) 
		 {
		  this.price = price;
		 }
		 public String toString() {
	            return ""+ getName()  +""+getWeight()+ ","+getPrice()
	                    +  "";
	        }
}
