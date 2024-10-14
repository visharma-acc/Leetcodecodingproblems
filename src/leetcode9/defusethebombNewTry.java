package leetcode9;

public class defusethebombNewTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []code = {2,4,9,3};
		
		int k = -2;
		
		if(k>0)
		{
			int [] res=new int [code.length];
			int l=0, r=code.length;
		
			for(int i=0;i<code.length;i++)
			{
				int sum=0;
				int t=0;
				while(t<k)
				{
					System.out.println(code[(i+t+1)%r]);
					sum=sum+code[(i+t+1)%r];
					t++;
				}	
				res[i]=sum;
			System.out.println("i="+i+" "+res[i]);	
			}
			
		}
		
		int c=0;
		
		if(k<0)
		{
			int [] res=new int [code.length];	
		  int n=code.length;
			k=k*-1;
			for(int i=0;i<n;i++)
			{
				int sum=0;
			   for(int j=1;j<=k;j++)
			   {
				  int m=(i-j)%n; 
				  if(m<0)m=m+n;
			      int t= code[m];
			      sum=sum+code[m];
			    
			   }
			   res[i]=sum;
			   System.out.println(sum);
			   System.out.println("******");
			}
			
		}
		
		if(k==0)
		{
			for(int i=0;i<code.length;i++)
				code[i]=0;
		}
		
		
			
		}
		

}
