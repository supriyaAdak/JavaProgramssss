package Designpatterns;

public class LazyLoading 
{
	private static String message = "";
 private LazyLoading () {}
 
 //lazy singleton instance declaration
 private static  LazyLoading lz ;
 
 public static LazyLoading getInstance()
 {
	 if(lz==null){
		 lz = new LazyLoading();
         //System.out.println("SingletonCls instance created for the first time.");
     }
     return lz;
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

