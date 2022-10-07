package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimenumberTest {
@Test

public void evaluatesExpression() {
	Primenumber prime =new Primenumber();
	String s1 = prime.calc(22);
	assertEquals("is not prime", s1);
}
}
