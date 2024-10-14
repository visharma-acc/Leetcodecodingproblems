package leetcode11;

public class arrangeCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2147483647;
		
		int s=0, i=1, itr=0;
		
		while(s<=n)
		{
		  s=s+i;
		  if(s>n)break;
		  i=i+1;
		  itr++;
		  System.out.println(s+"  "+itr);
		}
		
		System.out.println(s+"  "+itr);
	}

}
