package Collectionspackage;
import java.util.Scanner;

public class TWR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
try(
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in))
{
	int num = sc1.nextInt()*sc2.nextInt();
	System.out.println(num);
}
catch (ArithmeticException e)
{
	e.printStackTrace();
}
	finally
	{
		System.out.println("I am Nirata");
	}
	}

}
