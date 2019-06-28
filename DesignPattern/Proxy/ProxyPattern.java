package Proxy;

public class ProxyPattern {
public static void main(String[] args) {
	 Image image = new ProxyImage("abc.java");
	  image.display(); 
     System.out.println("");
     
     //image will not be loaded from disk
     image.display();
}
}