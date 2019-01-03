package tanerus.designpattern.behavioral.template.everydaydemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateEverydayDemo {

	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}

	public static void main(String[] args) {
		Person first = new Person("First", "111-111-1111", 39);
		Person second = new Person("Second", "222-222-2222", 41);
		Person third = new Person("Third", "333-333-3333", 38);

		List<Person> people = new ArrayList<>();
		people.add(first);
		people.add(second);
		people.add(third);

		System.out.println("Not sorted!");
		printContents(people);

		Collections.sort(people);

		System.out.println("\nSorted by age");
		printContents(people);

	}

}
