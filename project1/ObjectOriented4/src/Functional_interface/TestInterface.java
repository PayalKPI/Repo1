package Functional_interface;

interface TestInterface 
{
	public void square(int a); //abstract method
	
	default void show() //default method
	{
		System.out.println("Default method");
	}
}
class DefaultM implements TestInterface 
{


	
	

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println(a * a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultM d = new DefaultM();
		d.square(4);
		d.show();
	}


}
