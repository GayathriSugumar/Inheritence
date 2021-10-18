package Inheritence;

public class PhonePayV001 {
	
	String name;
	String version;
	int releaseYear;

	public PhonePayV001(String name, String version, int releaseYear) {
		this.name = name;
		this.version = version;
		this.releaseYear = releaseYear;
	}
	public static void transferMoney() {
		System.out.println(" Transaction successfully");
	}

	public static void rechargeMobile() {
		System.out.println(" Recharge  successfull");
	}

	public static void electricityBill() {
		System.out.println(" Electricity bill paid successfull");
	}

	public static void rechargeDTH() {
		System.out.println(" DTH recharge successfull ");
	}


	

}
