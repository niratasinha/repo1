package com;

public class Primenumber {
	public String calc(int a) {
		if (a<=1)
		{
			return "not a prime number";
		}
		for (int i=2;i<a; i++) {
			if (a % i ==0)
			{
				return "is prime";
			}
		}
		return "not prime";
	}
	
	}
