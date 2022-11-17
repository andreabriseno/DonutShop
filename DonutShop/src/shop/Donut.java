package shop;

public class Donut { //this is a class to make object, Objects are things that we interact with 
	private String name;
	private double price;
	private String type;
	private String icing;
	private String filling;
	
	//overloading means multiple different versions of the same methods
	public Donut() {}
	
	//constructor has no data type- no return type needs same name as class
	public Donut (String name, double price, String type, String icing, String filling) {
		this.name = name;
		this.price = price;
		this.type = type; 
		this.icing = icing; 
		this.filling = filling;
	}
	
	
	
	//need a method to have access to methods, everything that is a setter does not return anything 
	public void setName(String name) {
		this.name = name;
	}
	//when using getter will return type is the attribute ex. "private String name"
	public String getName() { // does not take in parameters bc does not need any 
		return this.name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIcing() {
		return icing;
	}
	public void setIcing(String icing) {
		this.icing = icing;
	}
	public String getFilling() {
		return filling;
	}
	public void setFilling(String filling) {
		this.filling = filling;
	}
	
	
}
