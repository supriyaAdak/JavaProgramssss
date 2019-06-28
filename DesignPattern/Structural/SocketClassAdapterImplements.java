package Structural;

public class SocketClassAdapterImplements extends Socket implements SocketAdapter
{

	@Override
	public AdapterVolt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public AdapterVolt get12Volt() {
		// TODO Auto-generated method stub
		AdapterVolt v= getVolt();
		return convertVolt(v,10);
	}

	

	@Override
	public AdapterVolt get3Volt() {
		// TODO Auto-generated method stub
		AdapterVolt v= getVolt();
		return convertVolt(v,40);
	}
	private AdapterVolt convertVolt(AdapterVolt v, int i) {
		// TODO Auto-generated method stub
		return new AdapterVolt(v.getvolts()/i);
	}
}
