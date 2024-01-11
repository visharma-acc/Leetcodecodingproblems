package leetcode2;

import java.util.HashSet;

public class RepeatElement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {-401451,-177656,-2147483646,-473874,-814645,-2147483646,-852036,-457533,-401451,-473874,-401451,-216555,-917279,-457533,-852036,-457533,-177656,-2147483646,-177656,-917279,-473874,-852036,-917279,-216555,-814645,2147483645,-2147483648,2147483645,-814645,2147483645,-216555};
		double sums=0;
		HashSet<Double> hs=new HashSet<Double>();
		
		for(int i:nums)
		{ sums+=i;
		  hs.add((double) i);	
			
		}

		double sumhs=0;
		
		
		
		for(Double i:hs)
		{
			sumhs+=(3*i);
		
		}
		

		
		int ans=(int) ((sumhs-sums)/2);
		
	
		
	}

}
