package tanerus.designpattern.creational.singleton.realdemo.thread_safe;

public class DbSingleton {

	private static volatile DbSingleton instance = null;

	private DbSingleton() {
		if (instance != null) {
			throw new RuntimeException("Use geteInstance() method to create");
		}
	}

	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized (DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}

}
