package Designpatterns;

public class Threadsafe 
{
	private static String message = "";
	 private Threadsafe () {}
	 
	 //lazy singleton instance declaration
	 private static  Threadsafe threadsafe ;
	 
	 public static synchronized Threadsafe getInstance()
	 {
		 if(threadsafe==null){
			 threadsafe = new Threadsafe();
	         //System.out.println("SingletonCls instance created for the first time.");
	     }
	     return threadsafe;
	 } 
	     public String getMessage() 
	     {
		        return message;
		 }
		 
		    // setter for the variable message
		    public void setMessage(String message) 
		    {
		        this.message = message;
		    }
	
}
