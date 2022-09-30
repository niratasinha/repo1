
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
int num=100/0;
		System.out.println("Divisible by 0" +num);
	}
 catch (ArithmeticException e)
{ 
	e.printStackTrace();
}
	finally {System.out.println("Resume");
}
}
}
