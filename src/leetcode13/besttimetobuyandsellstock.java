package leetcode13;

public class besttimetobuyandsellstock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []prices = {7,1,5,3,6,4};
		 int l=prices.length;
		 int max=0;
		 
		 for(int i=0;i<l-1;i++)
		 {
			for(int j=l-1;j>i;j--)
			{
				max=Math.max(max, prices[j]-prices[i]);
			}
		 }
		 
		 System.out.println(max);
		 
		 int buy=prices[0];
		 int maxprof=0;
		 
		 for(int i=1;i<l;i++)
		 {
			 if(prices[i]<buy)
				 buy=prices[i];
			 
			 System.out.println(buy);
			 
			 maxprof=Math.max(maxprof, prices[i]-buy);
			 
			 System.out.println(maxprof);
			 
		 }

	}

}
