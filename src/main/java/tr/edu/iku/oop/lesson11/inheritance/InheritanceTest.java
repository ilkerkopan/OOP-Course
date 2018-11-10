package tr.edu.iku.oop.lesson11.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		Worker worker = new Worker("Jim", 1981, 5000);

		System.out.println("worker name:" + worker.getName());
		System.out.println("birthyear:" + worker.getBirthyear());
		System.out.println("salary:" + worker.getSalary());
		
		System.out.println(worker.toString());

		Person person = new Worker("John", 1990, 3000);

		System.out.println("worker name:" + person.getName());
		System.out.println("birthyear:" + person.getBirthyear());
//		System.out.println("salary:" + person.getSalary());
		
		Person person2 = new Person("Jack", 2000);

		System.out.println("worker name:" + person2.getName());
		System.out.println("birthyear:" + person2.getBirthyear());
	}

}
