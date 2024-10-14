package leetcode12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortinghashmapbyKey {
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(10, "Rohit");
		hm.put(4, "Virat");
		hm.put(7, "Surya");
		hm.put(12, "Pant");
		
		Set<Integer> keyset=hm.keySet();
		for(int k:keyset)
		{
			System.out.println(k+" "+hm.get(k));
		}
			
		LinkedHashMap<Integer, String> lmap=new LinkedHashMap<>();
		ArrayList<Integer> list=new ArrayList<>(keyset);
		Collections.sort(list);
		System.out.println(list);
		for(int i:list)
		{
			lmap.put(i, hm.get(i));
			System.out.println(lmap);
		}
		
		// sort using key values
	
	   ArrayList<String> list2=new ArrayList<>(hm.values());
	   Collections.sort(list2);
	   System.out.println(list2);
	   LinkedHashMap<Integer, String> lmap2=new LinkedHashMap<>();
	   for(String s:list2)
		{
			
		}
	   
		}
	}


