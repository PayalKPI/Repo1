package Practice_1;
import java.util.ArrayList;
import java.util.List;

import Practice.TestForEach;
public class Items_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> itemsList = new ArrayList<String>();
		itemsList.add("Pen");
		itemsList.add("Paper");
		itemsList.add("Box");
		itemsList.add("Eraser");
		System.out.println("------ Iterating by passing lambda expression--");
		itemsList.forEach(items -> System.out.println(items));
		TestForEach tfe = items -> System.out.println(items);
		

	}

}
