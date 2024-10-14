package leetcode13;

public class buyChoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []prices = {1,2,2};
		int money = 3;
		int tot=money;
		for( int i=0;i<2;i++)
		{
			for(int j=i+1;j<prices.length;j++)
			{
				if (prices[i]>prices[j])
				{
					prices[i]=prices[i]^prices[j];
					prices[j]=prices[i]^prices[j];
					prices[i]=prices[i]^prices[j];
				}
			}
			
			tot=tot-prices[i];
		}
		
		if(tot<0)
			System.out.println(money);
		else
			System.out.println(tot);
	}
	
	

}
