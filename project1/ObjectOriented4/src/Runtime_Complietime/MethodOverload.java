//Compile-time polymorphism(Method overloading)


package Runtime_Complietime;

public class MethodOverload {
	
	static void show(int a , int b)
	{
		System.out.println("Integer function");
	}
	
	static void show(double a, double b)
	{
		System.out.println("double function");
	}
	
	public static void main(String[] args)
	{
		show(2,4);
		show(2.4,4.5);
	}
	
}


