package handson;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TestForEach{
	 void print(List test);
}

public class Listoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=new ArrayList<String>();
list.forEach(list1->System.out.println(list1));
	}

}
