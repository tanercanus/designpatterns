package tanerus.designpattern.structural.decorator.realdemo;

//Concrete component
public class SimpleSandwich implements Sandwich{

	@Override
	public String make() {
		return "Bread";
	}

}
