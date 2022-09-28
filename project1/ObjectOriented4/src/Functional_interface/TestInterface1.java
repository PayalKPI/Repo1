package Functional_interface;

interface TestInterface1 {

	 void addition(int a, int b);

	//abstract method
	
	default void show() //default method
	{
		System.out.println("Default method");
	}
}
class DefaultN implements TestInterface1 
{
	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
        System.out.println(a + b);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultN d = new DefaultN();
		d.addition(4, 5);
		d.show();

	}

	
		
	

		
	

}
