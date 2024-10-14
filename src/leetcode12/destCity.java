package leetcode12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class destCity {
	
	public static String reachDestination(HashMap<String, String> map ,List<List<String>> paths)
	{
		System.out.println("function call..");
		System.out.println(map);
		System.out.println(paths);	
		String destinationcity=null;
		int len=paths.size()-1;
		for(int i=0;i<paths.size();i++)
		{
			System.out.println("loop runn..");
			String des=paths.get(i).get(0);
			System.out.println(des);
			if(map.containsValue(des))
			{
				System.out.println("inside if destination found");
				map.put(des,paths.get(i).get(1));
				System.out.println(map);
				System.out.println("distination found..decrementing");
				System.out.println(len);
				len=len-1;
				System.out.println(len);
				if(len==0)
				{
					System.out.println("inside if break......");
					destinationcity=paths.get(i).get(1);
					System.out.println(destinationcity);
					break;
				}
			}
		}
		return destinationcity;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 List<List<String>> paths=new ArrayList<List<String>>();
	 ArrayList<String> l1=new ArrayList<>();
	 l1.add("London");
	 l1.add("Newyork");
	 paths.add(l1);
	 ArrayList<String> l3=new ArrayList<>();
	 l3.add("Liam");
	 l3.add("Sau Paulo");
	 paths.add(l3);
	 ArrayList<String> l2=new ArrayList<>();
	 l2.add("Newyork");
	 l2.add("Liam");
	 paths.add(l2);
	
	 System.out.println(paths);
	 String city=new String();
	 for(int i=0;i<paths.size();i++)
	 {
		 HashMap<String, String> hs=new HashMap<String, String>();
		 hs.put(paths.get(i).get(0), paths.get(i).get(1));
		 System.out.println(hs);
		 city=reachDestination(hs,paths);
		 if (city!=null) {
			 break;
		 }
		 System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
	 }
	 System.out.println(city);
	 if(city==null)
	 {
		 System.out.println("you did not got it right..logic needs correction");
	 }
	 
	}

}
