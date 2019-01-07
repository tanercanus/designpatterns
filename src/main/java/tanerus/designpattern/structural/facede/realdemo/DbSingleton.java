package tanerus.designpattern.structural.facede.realdemo;

import java.sql.Connection;

public class DbSingleton {

	private static DbSingleton instance = null;

	private DbSingleton() {

	}

	public static DbSingleton getInstance() {
		if (instance == null) {
			instance = new DbSingleton();
		}
		return instance;
	}

	public Connection getConnection() {
		// add connection impl here!!
		return null;
	}

}
