package shop; //package is important bc everything can interact w/o having to an import
//this file just exist to run code
public class DonutTest {
//when talking about methods static means its attached to the class and its ran by the class 
	public static void main(String[] args) {
		Donut donut1 = new Donut(); //constructor is the function that builds the info
		donut1.setName("Chocolate Rasbery Surprise");
		donut1.setFilling("Rasbery jam");
		donut1.setIcing("Chocolate Glaze");
		donut1.setType("Raise");
		donut1.setPrice(2.99);
		
		Donut donut2 = new Donut("Sugar Glazed Mochi", 3.99, "Mochi", "Sugar Glaze", "None"); 
		
		//System.out.println("Name: " + donut1.getName());
		//System.out.println("Filling: " + donut1.getFilling());
		//System.out.println("Icing: " + donut1.getIcing());
		//System.out.println("Type: " + donut1.getType());
		//System.out.println("Price: " + donut1.getPrice());
		
		System.out.println("Name: " + donut2.getName());
		System.out.println("Filling: " + donut2.getFilling());
		System.out.println("Icing: " + donut2.getIcing());
		System.out.println("Type: " + donut2.getType());
		System.out.println("Price: " + donut2.getPrice());
		
	}
}
