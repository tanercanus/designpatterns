package tanerus.designpattern.behavioral.memento.realdemo;

public class MementoDemo {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();

		Employee emp = new Employee();

		emp.setName("John Wick");
		emp.setAddress("AAA Street");
		emp.setPhone("111-111-1111");

		System.out.println("Employee before save: " + emp);

		caretaker.save(emp);

		emp.setPhone("222-222-2222");
		caretaker.save(emp);
		System.out.println("Employee after changed phone number save: " + emp);

		emp.setPhone("333-333-3333"); // we haven't called save!!!!

		caretaker.revert(emp);

		System.out.println("Reverts to last save point: " + emp);
		caretaker.revert(emp);

		System.out.println("Reverted to original: " + emp);

	}

}
