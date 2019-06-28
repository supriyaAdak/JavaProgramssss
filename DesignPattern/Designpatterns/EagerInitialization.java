package Designpatterns;



public class EagerInitialization {
	private String message ="";
		//private constructor
	private EagerInitialization() {}
	
	 private static  EagerInitialization instance = new EagerInitialization();
	 
	 public static EagerInitialization getInstance(){
	     return instance;
	 }
	 public String getMessage() {
	        return message;
	    }
	 
	    // setter for the variable message
	    public void setMessage(String message) {
	        this.message = message;
	    }
		
	    

}
