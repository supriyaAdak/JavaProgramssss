package Structural;

public class PcommandProxy implements PcommandExecutor
{
	private boolean admin ;
	 private PcommandExecutor executor;
	 
	 public PcommandProxy(String user ,String Password) 
	 {
		 if("Admin".equals(user)&&"Admin123".equals(Password)) 
		 {
			 admin=true;
			 executor = new Pcommandimplement();
			 
		 }
			 
	 }

	@Override
	public void runCommand(String cmd) throws Exception {
		// TODO Auto-generated method stub
		
		if(admin) 
		{
			executor.runCommand(cmd);
			
		}
		else 
		{
			if(cmd.trim().startsWith("rm")) 
			{
				throw new Exception("rm command is not allowed for non-admin users.\"");
				
			}
			else
				executor.runCommand(cmd);
		}
		
	}

}
