package tanerus.designpattern.creational.builder.everydaydemo;

public class BuilderEverydayDemo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();

		builder.append("This ");

		builder.append("is a ");

		builder.append("xxx and age ");

		builder.append("is ");

		builder.append(40);

		System.out.println(builder);

	}

}
