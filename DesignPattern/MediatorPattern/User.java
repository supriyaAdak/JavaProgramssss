package MediatorPattern;

public class User 
 {
	private String name;
	 public User(String name) 
	 {
		 this.name=name;
		 
	 }
public void sendMessage (String message) {
	MediatorChatRoom.ShowMessage(this, message);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
