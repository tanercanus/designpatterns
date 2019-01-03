package tanerus.designpattern.creational.singleton.realdemo.thread_safe;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();
		DbSingleton instance2 = DbSingleton.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
	}

}
