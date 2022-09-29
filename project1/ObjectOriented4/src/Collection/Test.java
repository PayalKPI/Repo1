package Collection;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		ArrayList list2 = new ArrayList();
		list.add("a");
		list.add("b");
		System.out.println(list.get(0));
		System.out.println(list2);
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)=="a")//i=0,1,.....
			System.out.println(i); 
			}
		
     
		for(int j=0; j<10; j++) 
		{
			list2.add(j);
			
	
		}
		System.out.println(list2); }

	}


