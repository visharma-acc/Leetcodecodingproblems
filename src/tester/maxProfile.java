package tester;

public class maxProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {45, 24, 35, 31, 40, 38, 11};
		int max=0, profit=0;
		int i=0, j=i+1;
		
		while(j<num.length)
		{
			if(num[i]>num[j])
			{
				i=j;
				j++;
			}
			else
			{
				if(max<num[j])
					max=num[j];
				profit=max-num[i];
				j++;
				
			}
			
		
			
		}
		
		System.out.println(profit);
		
		
	}

}
