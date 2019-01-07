package tanerus.designpattern.structural.decorator.realdemo;

public class DecoratorSandwichDemo {

	public static void main(String[] args) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

		System.out.println(sandwich.make());
	}

}
