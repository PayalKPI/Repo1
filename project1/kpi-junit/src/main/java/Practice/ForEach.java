package Practice;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		System.out.println("------ Iterating by passing lambda expression--");
		gamesList.forEach(games -> System.out.println(games));
		TestForEach tfe = games -> System.out.println(games);
		

	}

}
