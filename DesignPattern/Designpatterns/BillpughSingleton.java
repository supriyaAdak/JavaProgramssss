package Designpatterns;

public class BillpughSingleton 
{
	// private constructor
private BillpughSingleton(){}
   /// static inner class - inner classes are not loaded until they are
// referenced. 
    private static class SingletonHelper{
        private static final BillpughSingleton INSTANCE = new BillpughSingleton();
    }
    
    public static BillpughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    private String message ="";
    
	public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    } 
}
