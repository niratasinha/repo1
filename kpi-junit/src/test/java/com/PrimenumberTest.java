package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimenumberTest {
@Test

public void evaluatesExpression() {
	Primenumber prime =new Primenumber();
	String s1 = prime.calc(23);
	assertEquals("is prime", s1);
}
}
