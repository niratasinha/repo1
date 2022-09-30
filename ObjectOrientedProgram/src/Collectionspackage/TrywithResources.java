package Collectionspackage;
import java.io.FileOutputStream;

public class TrywithResources {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
try (FileOutputStream fileOutputStream = new FileOutputStream("filepath"))
{
	String msg="welcome to javaTpoint";
	byte byteArrary[] = msg.getBytes();//converting string to byte Array
	fileOutputStream.write(byteArray);
	System.out.println("Message writen to file successfully");
}
catch (Exception exception) 
{
	System.out.println(exception);
}
finally 
{
System.out.println("I am here");
}
	}}

