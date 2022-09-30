package com;

public class Palindrome {
	public String palindrome(int x) {
		int sum = 0;
		int no=x;
		while(no>0) {
			sum = sum*10 + (no%10);
			no = no/10; }
		if(sum==x) {
			return "Palindrome"; }
		else {
			return "Number is not palindrome";
			
		}
	}

}
