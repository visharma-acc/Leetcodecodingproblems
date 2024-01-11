package leetcode6;

public class AddDigit {

	public static int addnumber(int n)
	{
		int sum=0;
		while(n>0)
		{
			int t=n%10;
			sum=sum+t;
			n=n/10;
		}
		System.out.println(sum);
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int num=38;
	   int s=addnumber(num);
	   while(s>9)
	   {
		   s=addnumber(s);
	   }
		
		System.out.println(s);
	}

}
