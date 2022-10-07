package handson;

//@FunctionalInterface
interface MathOperation{
	int operation(int a, int b);

}
public class LamdaPractice {
	
	public static void main(String[] args) {
		LamdaPractice Tester = new LamdaPractice();
		
		//Classname objname = new Classname()
		//TODO Auto-generated method stub
		//with Type declaration
		MathOperation addition = (int a, int b) -> a+b;//anonymous function, no storage required
		
		//without type declaration
		MathOperation subtraction = (a,b)-> a-b;
		
		//with return statement along with curly braces
		MathOperation multiplication = (a,b)-> {return a*b;};
		
		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a/b;
		
		System.out.println(Tester.operator(1,2,addition));
		System.out.println(Tester.operator(5,3,subtraction));
		System.out.println(Tester.operator(2,3,multiplication));
		System.out.println(Tester.operator(10,5,division));
		}
	private int operator(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }

	}
//no or minimum method creation
//create a method
//create a functional interface

