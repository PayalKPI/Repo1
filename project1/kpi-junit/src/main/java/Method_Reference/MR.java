package Method_Reference;

public class MR {
	public static void saySomething() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sayable1 = MR::saySomething;
		sayable1.say();
		 //calling interface method
		
		Sayable2 sayable2 = MR::saySomething;
		sayable2.say();

	}

}
