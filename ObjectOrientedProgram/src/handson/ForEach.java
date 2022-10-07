package handson;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TestForEach{
	void print();
}
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> gamesList = new ArrayList<String>();
gamesList.add("Football");
gamesList.add("Cricket");
gamesList.add("Chess");
gamesList.add("Hockey");

//value through for loop: long code
for (int i=0; i<gamesList.size();i++) {
	System.out.println(gamesList.get(i));
}
System.out.println("------Iterating by passing lamda expression----");
gamesList.forEach(games->System.out.println(games));//lamda is used here

	}

}
