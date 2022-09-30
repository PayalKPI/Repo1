package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest {

	@Test
	public void evaluatesExpression() {
		Palindrome p = new Palindrome();
		String sol = p.palindrome(161);
		assertEquals("Palindrome", sol); }

}
