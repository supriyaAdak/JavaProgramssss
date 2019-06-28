package MediatorPattern;

public class MediatorPatternmain {
public static void main(String[] args) {
	User sup = new User("Supriya:");
	User sami = new User("samiksha:");
	User p = new User("prince::");
	sup.sendMessage("hi sup");
	sup.sendMessage("hhhh");
	sami.sendMessage("hi sami");
	p.sendMessage("hi prince");
}
}
