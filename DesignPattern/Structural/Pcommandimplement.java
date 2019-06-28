package Structural;

public class Pcommandimplement implements PcommandExecutor
{

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(cmd);
		System.out.println("'"+cmd+"'command exec");
	}

}
