package tanerus.designpattern.structural.flyweight.realdemo;

//Instances of Item will be the Flyweights
public class Item {
	
	//everything final and no setters
	//setter only with constructor
	private final String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

}
