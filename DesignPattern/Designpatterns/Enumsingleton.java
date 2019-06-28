package Designpatterns;

public enum Enumsingleton 
{
instance;
	
	private String message ="";
	public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    } 
}
