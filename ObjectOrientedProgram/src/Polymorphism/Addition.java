package Polymorphism;

public interface Addition {
	abstract void  add(int a);
	
	default void result(int a, int b)
	{
		int r = a=b;
		System.out.println("Result is" +r);
	}
}

