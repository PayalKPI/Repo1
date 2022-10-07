package Lambda;

public class LambdaPractice {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaPractice tester = new LambdaPractice();
		
		
		MathOperation addition = (int a, int b) -> a+b; //with type declaration
		
		MathOperation substraction = (a,b)-> a-b; //without type declaration
		
		MathOperation multiplication = (a,b)-> { return a * b; }; //with return statement along with curly
		
		MathOperation division = (int a, int b) -> a/b ; //without return and curly
		
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, substraction));
		System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
		
		
		

	}
	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }


	
	

	
	}


