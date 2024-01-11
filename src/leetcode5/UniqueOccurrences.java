package leetcode5;

import java.util.HashMap;

public class UniqueOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75
		int []arr = {-3,0,1,-3,1,1,1,-3,10,0};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int x: arr)
		{
			if(hm.containsKey(x))
			{
				int t=hm.get(x);
				hm.replace(x,t+1 );
			}
			else
			{
				hm.put(x, 1);
			}
		}
	
		
	}

}
