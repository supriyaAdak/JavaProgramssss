package Designpatterns;

public class Reflection {
	public static void main(String[] args) 
	{
		 Singletonn singleton1 = Singletonn.getInstance();
	     Singletonn singleton2 = Singletonn.getInstance();
	    
	     System.out.println(" Hash code of singleton1 = "+ singleton1.hashCode());
	     System.out.println( "Hash code of singleton2 = "+ singleton2.hashCode() );
		
	}
	
}
class Singletonn
{
	public static Singletonn singletonn = null;
	  private Singletonn()
	   {
	      // private constructor
	   }
	  public static Singletonn getInstance()
	   {
	      if( singletonn == null)
	      {
	         singletonn = new Singletonn();
	      }
	      return singletonn;
	   }
}
