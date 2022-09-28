package Polymorphism;

public class Compiletime {
void display (int n)
{
	System.out.println("number"+n);
	}
void display (int n1, int n2)
{ 
	System.out.println("numbers" +n1 +n2);
}
public static void main (String[]args)
{
	Compiletime obj = new Compiletime();
	obj.display(10);
	obj.display(11,12);
}
}
