package Designpatterns;



public class Singleton {
	


public static void main(String[] args)
{
	
	EagerInitialization instance = EagerInitialization.getInstance();
	LazyLoading obj =LazyLoading.getInstance();
	Threadsafe obj1 =Threadsafe.getInstance();
	BillpughSingleton obj2 =BillpughSingleton.getInstance();
    String name ="hi";
    instance.setMessage(name);
    obj.setMessage(name);
    obj1.setMessage(name);
  //  obj2.setMessage(name);
   BillpughSingleton.getInstance().setMessage(name);
    Enumsingleton.instance.setMessage("This message is set in main of ExamplePgm");
  System.out.println("eagerinitialization:::...."+instance.getMessage());  
  System.out.println();
  System.out.println("LazyLoading......."+obj.getMessage());  
  System.out.println();
  System.out.println("Threadsafe......."+obj1.getMessage());  
  System.out.println();
  System.out.println( "enum........."+Enumsingleton.instance.getMessage()); 
  System.out.println();
  System.out.println("Bill pugh singleton...."+obj2.getMessage());
  System.out.println();
  System.out.println(BillpughSingleton.getInstance().getMessage());
  System.out.println();
}
}