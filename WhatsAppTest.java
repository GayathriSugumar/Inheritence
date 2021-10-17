package Inheritence;

public class WhatsAppTest {

	public static void main(String[] args) {		
		Whatsapp002 WA=new Whatsapp002();
		System.out.println(WA.version);
		System.out.println(WA.name);
		WA.WhatsAppVersion();
		WA.voicecall();
		WA.chat();
		WA.groupCreate();
	}

	
}
