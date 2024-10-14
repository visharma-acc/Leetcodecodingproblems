package leetcode12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class destCity2 {
	
	public static String reachDestination(String Source ,HashMap<String, String> map)
	{
		String descity=map.get(Source);
		int len=map.size();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(map.containsKey(descity))
			{
				descity=map.get(descity);	
				count=count+1;
			}
		}
		
		System.out.println(count);
		System.out.println("function call end---");
		if(count==len-1)
		return descity;
		else
			return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 List<List<String>> paths=new ArrayList<List<String>>();
	 ArrayList<String> l1=new ArrayList<>();
	
	 ArrayList<String> l3=new ArrayList<>();
	 l3.add("Liam");
	 l3.add("Sau Paulo");
	 paths.add(l3);
	 ArrayList<String> l2=new ArrayList<>();
	 l2.add("Newyork");
	 l2.add("Liam");
	 paths.add(l2);
	 l1.add("London");
	 l1.add("Newyork");
	 paths.add(l1);
	
	 System.out.println(paths);
	 
	 HashMap<String, String> hs=new HashMap<String, String>();
	 for(int i=0;i<paths.size();i++)
	 {
		 hs.put(paths.get(i).get(0), paths.get(i).get(1));
	 }
	 
	 for(int i=0;i<paths.size();i++)
	 {
		 String Source=paths.get(i).get(0);
		 System.out.println("function call "+i);
		 String tmp=reachDestination(Source,hs);
		 System.out.println(Source+" "+tmp);
	 }

}
}	
