package Structural;

import Utility.IO;

public class Proxypatterntest
{
	public static void main(String[] args)
	{
		System.out.println("enter user name ");
		String s =IO.Printstring();
		System.out.println("enter password ");
		String pass =IO.Printstring();
		PcommandExecutor executor = new PcommandProxy(s, pass);
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
	}

}
