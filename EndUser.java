package Inheritence;

public class EndUser {
	
	public static void displayInfo(PhonePayV001 objs[]) {
		System.out.println("Phonepay Information");
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i].name);
			System.out.println(objs[i].version);
			System.out.println(objs[i].releaseYear);
			System.out.println("************************");
		}

	}

	public static void main(String[] args) {
		PhonePayV001 v1 = new PhonePayV001("Phone pay", "V001", 2016);

		PhonePayV001 v2 = new PhonePayV001("Phone pay", "V001", 2017);
		PhonePayV001 v3 = new PhonePayV001("Phone pay", "V001", 2018);
		PhonePayV001 v4 = new PhonePayV001("Phone pay", "V001", 2019);

		PhonePayV001 objs[] = { v1, v2, v3 };
		EndUser.displayInfo(objs);


	}

}
