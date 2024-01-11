package leetcode5;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []candies = {4,2,1,1,2};
	    int extraCandies = 1;
	    List<Boolean> ls=new ArrayList<>();
	    
	    int len=candies.length;
	    
	    int max=candies[0];
	    
	    for(int i=1;i<len;i++)
	    {
	     if(max<candies[i]) max=candies[i];
	    }

	    for(int i=0;i<len;i++)
	    {
	    	if(candies[i]+extraCandies>=max)
	    		ls.add(true);
	    	else
	    		ls.add(false);
	    }

	    System.out.println(ls);
	}

}
