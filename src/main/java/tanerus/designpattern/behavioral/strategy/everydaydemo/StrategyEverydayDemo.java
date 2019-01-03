package tanerus.designpattern.behavioral.strategy.everydaydemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {

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
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				}
				
				if (o1.getAge() < o2.getAge()) {
					return -1;
				}
				
				return 0;
			}
			
		});
		
		System.out.println("\nSorted by age!");
		printContents(people);
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println("\nSorted by name!");
		printContents(people);
				
	}

	private static void printContents(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.getName());
		}
	}

}
