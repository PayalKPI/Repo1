package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author PayalPitale
 *
 */
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		ArrayList list2 = new ArrayList();
		

		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		
		Set<String> set = new HashSet<String>();
		Set set2 = new HashSet();
		set.add("a");
		set.add("a");
		set2.add(1);
		System.out.println(set);
		System.out.println(list);
		
		

		//list2.add("x");
		Map<String, Integer> hm
		= new HashMap<String, Integer>();
		
	hm.put("a",new Integer(100));
	hm.put("b",new Integer(200));
	hm.put("c",new Integer(300));
	hm.put("d",new Integer(400));
	
	System.out.println(hm.get("d"));
	}
		
}

	
	
		

	   
		

		
	


