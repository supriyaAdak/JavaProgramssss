package Structural;

public class AdapterVolt
{
	private int Volts;
public AdapterVolt(int v) 
{
	this.Volts=v;
}
public int getvolts() 
{
	return Volts;
}
public int setVolts (int volts) {
	return this.Volts=volts;
	
}
}
