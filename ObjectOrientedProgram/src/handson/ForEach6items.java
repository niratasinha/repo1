package handson;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface

Interface TestForEach{
//void print(List test);
//}

public class ForEach6items {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> gameslist = new ArrayList<String>();
gameslist.add("Football");
gameslist.add("Cricket");
gameslist.add("Chess");
gameslist.add("Hockey");
gameslist.add("Tennis");
gameslist.add("Kabaddi");

gameslist.forEach(games->System.out.println(games));
	}

}
