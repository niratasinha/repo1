package com;

public class Palindrome {
public String Palindrome (int n)
{
	int sum=0;
	int num=n;
	while(num>0) {
		sum = sum*10+(num%10);
		num=num/10;
	}
	if(sum==n) {
		return "palindrome";
	}
	else {
		return "Not Palindrome";
	}
}
}
