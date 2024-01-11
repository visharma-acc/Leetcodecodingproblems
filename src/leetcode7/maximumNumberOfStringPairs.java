package leetcode7;

import java.util.HashMap;
import java.util.HashSet;

public class maximumNumberOfStringPairs {

	public static void main(String[] args) {
		
		//https://leetcode.com/problems/find-maximum-number-of-string-pairs/
		// TODO Auto-generated method stub
		String[]words = {"aa","ab","ba"};
		HashSet<String> hs=new HashSet<>();

        for(String str:words)
        {
        	int x=str.charAt(0)^str.charAt(1);
        	if(x!=0)hs.add(str);
        }
        int count=0;
        System.out.println(hs);
       
        for(String str:words)
        {
        	if(hs.size()==0)break;
        	StringBuilder s=new StringBuilder(str);
        	if(hs.contains(s.reverse().toString()))
        	{	
        		hs.remove(str);
        		hs.remove(s.reverse().toString());
        		count++;
        	}
        	
        }
        
   System.out.println(count);
	}

}
