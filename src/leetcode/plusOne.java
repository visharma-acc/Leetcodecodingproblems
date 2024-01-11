package leetcode;

public class plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] digits = {9,9,9,9,9,9,9};
		
		int c=0;
		int noofcarry=0;
		
		for(int i=digits.length-1;i>=0;i--)
		{
			if(i==digits.length-1)
			{
				int t=digits[i]+1;
				if(t<10)
				{
					digits[i]=t;
					c=0;
				}
				else
				{
					digits[i]=0;
					c=1;
					 noofcarry++;
				}
					
			}
			else
			{		
			if(digits[i]+c<10)
			{
				System.out.println("inside if");
				//System.out.print(digits[i]+"\t");
				System.out.print("Digit before "+digits[i]+"\t");
				digits[i]=digits[i]+c;
				System.out.print("i is "+i+ "\t");
				System.out.print("Digit "+digits[i]+"\t");
				System.out.print("carry is "+c+"\t");
				c=0;
			}
			else
			{
				System.out.println("inside else");
				//System.out.print(digits[i]+"\t");
				System.out.print("Digit before "+digits[i]+"\t");
			    digits[i]=0;
			    c=1;
			    System.out.print("i is "+i+ "\t");
				System.out.print("Digit "+digits[i]+"\t");
				System.out.print("carry is "+c+"\t");
			    noofcarry++;
			}
			}	
			System.out.println("");
		}
		
		for(int i=0;i<digits.length;i++)
		{
			System.out.print(digits[i]+"\t");
		}

		System.out.println("no of carry---"+noofcarry);
		if(noofcarry==digits.length)
		{
			int ar[]=new int[digits.length+1];
		
			for(int k=0;k<ar.length;k++)
			{
				if(k==0)
					ar[k]=1;
				else
					ar[k]=0;
			}
		}
		
	
		
		
	}

}
