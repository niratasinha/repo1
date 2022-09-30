package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest {
@Test
public void evaluatesExpression() {
	Palindrome n = new Palindrome();
	String s1=n.Palindrome(121);
	assertEquals("palindrome", s1);
	
}
}
