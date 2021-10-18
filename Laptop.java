package Inheritence;

public class Laptop {
	
	String name;
	String ramSize;
	int cost;
	String color;
	public Laptop(String name,String ramSize,int cost,String color){
		this.name=name;
		this.ramSize=ramSize;
		this.cost=cost;
		this.color=color;
		
	}
	public void signIn() {
		System.out.println("Enter password");
	}
	public void wirelessConnection() {
		System.out.println("USB,WiFi connection");
	}
	public void appInstallation() {
		System.out.println("Updates apps");
	}
}
