package Structural;

public class Adapterpatterntest 
{
public static void main(String[] args) {
		
		testClassAdapter();
		
	}
private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImplements();
		AdapterVolt v3 = getvolt(sockAdapter,3);
		AdapterVolt v12 = getvolt(sockAdapter,12);
		AdapterVolt v120 = getvolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getvolts());
		System.out.println("v12 volts using Class Adapter="+v12.getvolts());
		System.out.println("v120 volts using Class Adapter="+v120.getvolts());
	}
private static AdapterVolt getvolt(SocketAdapter sockAdapter, int i) {
	// TODO Auto-generated method stub
	switch (i)
	{
	case 3: return sockAdapter.get3Volt();
	case 12: return sockAdapter.get12Volt();
	case 120: return sockAdapter.get120Volt();
	default: return sockAdapter.get120Volt();
	}
}
}
