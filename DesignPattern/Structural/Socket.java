package Structural;

public class Socket {
	public AdapterVolt getVolt(){
		return new AdapterVolt(120);
	}
}
