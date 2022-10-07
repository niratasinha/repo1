package handson;

//@Functional Interface

interface Mental {
	String condition(String a);
}
public class Mentalcondition {
  public static void main(String[]args) {
	  Mentalcondition mental = new Mentalcondition();
	  
	  Mental stable = ("A","B","C","D") -> {return "A","B","C","D";};
	  
  }}

