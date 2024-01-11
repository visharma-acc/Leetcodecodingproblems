package leetcode6;

import java.util.HashMap;
import java.util.HashSet;

public class uniqueOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
		HashMap<Integer, Integer> hm=new HashMap<>();
		for (int x:arr)
		{
			if(!hm.containsKey(x))
			{
				hm.put(x, 1);
			}
			else
			{
				hm.replace(x, hm.get(x)+1);
			}
		}
		
		System.out.println(hm);
		HashSet<Integer>hs=new HashSet<Integer>(hm.values());
		System.out.println(hs);
		if(hs.size()==hm.size())
			System.out.println(true);
		else
			System.out.println(false);
	}

}
