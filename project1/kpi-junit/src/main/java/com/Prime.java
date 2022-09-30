package com;


public class Prime {
	public String p(int x) {
		for(int i=2; i<x/2; i++) {
			if(x%i==0) {
				return "Not a prime number";
			}
						
			
		}
		return "Prime number";
	}
	

}
	

	
	


