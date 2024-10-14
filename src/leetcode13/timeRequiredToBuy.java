package leetcode13;

public class timeRequiredToBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []tickets = {84,49,5,24,70,77,87,8};
		int k = 3 , count=0;
	
		while( tickets[k]!=0)
		{
		for(int i=0;i<tickets.length;i++)
		{
			if(tickets[i]>0)
			{	
				tickets[i]=tickets[i]-1;
				count++;
				if(tickets[k]==0)break;
			}
		}
		System.out.println("pass");
		}

		System.out.println(count);
	}

}
