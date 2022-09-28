//run-time polymorphism (Method-overriding)




package Runtime_Complietime;

public class Animal {
	public void move() {
		System.out.println("Animals can move");

	
	}

}
class Dog extends Animal {
	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

