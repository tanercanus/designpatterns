package tanerus.designpattern.behavioral.iterator.everydaydemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("John");
		names.add("Jack");
		names.add("Micky");

		Iterator<String> namesItr = names.iterator();

		while (namesItr.hasNext()) {
			String name = namesItr.next();
			System.out.println(name);
			namesItr.remove();
		}

		System.out.println("Names size: " + names.size());

	}
}
