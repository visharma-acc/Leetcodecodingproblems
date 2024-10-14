package leetocode8;

public class BestTimetoBuyandSellStck {

       public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []prices = {7,1,3,4,6};
			int l=0, r=prices.length-1;
			int i=l, j=r;
			int maxProfit=0;
			int tmp=0;
		
			
			while(l<=r)
			{
				if(prices[i]<prices[j])
				{
					tmp=prices[j]-prices[i];
					System.out.println(prices[i]+" "+prices[j]);
					if(maxProfit<tmp) maxProfit=tmp;
					System.out.println("tmp=="+tmp);
					j--;
				}
				else
				{
					j--;
				}
				if(j<i)
				{
					if(maxProfit<tmp) maxProfit=tmp;
					i++;
					l=i;
					j=r;
					System.out.println("value reset");
					System.out.println("l is now"+l+" "+"r is now "+r);
					System.out.println("maxprofit "+maxProfit);
				}
			}
			
	   System.out.println(maxProfit);
			
		}

	}
