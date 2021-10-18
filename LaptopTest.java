package Inheritence;

public class LaptopTest {
	public static void displayInfo(Laptop objs[]) {
		System.out.println("RAM size");
		for (int i = 0; i < objs.length; i++) {
			if (objs[i].ramSize == "4GB")
			{
				System.out.println(objs[i].name);
				System.out.println(objs[i].ramSize);
				System.out.println(objs[i].cost);
				System.out.println(objs[i].color);

				System.out.println("_______________________");
			}
			
		}
	}

	public static void main(String[] args) {
		Laptop L1=new Laptop("hp","64GB",100000,"ash");
		Laptop L2=new Laptop("Dell","8GB",50000,"black");
		Laptop L3=new Laptop("lenovo","4GB",48000,"blue");
		Laptop L4=new Laptop("lenovo","4GB",35000,"white");
		Laptop L5=new Laptop("hp","1TB",150000,"silver");
		Laptop objs[]= {L1,L2,L3,L4,L5};
		LaptopTest.displayInfo(objs);
	}

}
