package tanerus.designpattern.behavioral.iterator.realdemo;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		BikeRepository repo = new BikeRepository();
		
		repo.addBike("Cevelo");
		repo.addBike("Scott");
		repo.addBike("Fuji");
		
		Iterator<String> bikeIterator = repo.iterator();
		while(bikeIterator.hasNext()) {
			System.out.println(bikeIterator.next());
		}
		
	}

}
