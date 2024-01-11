package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class largestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {3,30,34,5,24,65,9};
		// "96553433024"
		HashMap<Integer, ArrayList<Integer>> hm=new HashMap<Integer, ArrayList<Integer>>();
		TreeMap<Integer, ArrayList<Integer>> tm=new TreeMap<>();
		for(int i:nums)
		{
			int m=i%10;
			if(!tm.containsKey(m))
			{
				ArrayList<Integer> ar=new ArrayList<Integer>();
				ar.add(i);
				tm.put(m, ar);
			}
			else
			{
				ArrayList<Integer> ar1 =tm.get(m);
				ar1.add(i);
				Collections.sort(ar1);
				tm.replace(m, ar1);
			}
				
		}
		
		System.out.println(tm);
		
	
		
		Set<Integer> keySet = tm.descendingKeySet();
		 
        // After reverse
        System.out.println("TreeMap after reverse:");
        
        HashSet<String> hs=new HashSet<>();
        if(hs.contains("aa"))
        	System.out.println("true;");
        
        StringBuilder builder =new StringBuilder();
 
        // Iterate view set of the keys
        // and get value of the key
        for (Integer key : keySet) {
            // Print key:value of the TreeMap
            System.out.println(key + " = "
                               + tm.get(key));
            ArrayList<Integer> ar=tm.get(key);
            for(int i:ar)
            builder.append(i);
		
        }
		
        System.out.println(builder);
	}

}
