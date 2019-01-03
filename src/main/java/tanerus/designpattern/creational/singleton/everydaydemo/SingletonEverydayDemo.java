package tanerus.designpattern.creational.singleton.everydaydemo;

public class SingletonEverydayDemo {

	public static void main(String[] args) {
		Runtime singletonRuntime = Runtime.getRuntime();
		singletonRuntime.gc();
		
		//write object address
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		
		System.out.println(anotherInstance);
		
		if ( singletonRuntime == anotherInstance ) {
			System.out.println("They are the same instance");
		}
	}

}
