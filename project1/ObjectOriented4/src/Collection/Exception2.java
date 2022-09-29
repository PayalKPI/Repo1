package Collection;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in);
				Scanner sc1 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in)) {
			System.out.println("Enter a first number-");
			int a =sc1.nextInt();
			System.out.println("Enter a second number-");
			int b =sc.nextInt();
			System.out.println("Enter a third number-");
			int c =sc3.nextInt();
			int add = sc1.nextInt()+sc.nextInt()+sc3.nextInt();
			System.out.println("Addition is:" + add); }
		
		}

	

}

