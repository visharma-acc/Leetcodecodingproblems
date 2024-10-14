package leetcode9;

public class defusethebomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []code = {2,4,9,3};
		int [] res=new int [code.length];
		int k = -2;
		
		if(k>0)
		{
			int l=0, r=code.length-1;
		
			for(int i=0;i<code.length;i++)
			{
				int t=k;
				int sum=0;
				while(k>0)
				{
					if(i+(t-k)+1>r) {
					//	System.out.println("if..."+"i="+"("+t+"-"+k+")=");
					//	System.out.println(i+(t-k)+1);
					//	System.out.println(l+k-1);
						sum=sum+code[l+k-1];}
					else {sum=sum+code[i+(t-k)+1];
					//System.out.println(code[i+(t-k)+1]);
					//System.out.println("sum="+sum);
					//System.out.println("else..."+"i="+"("+t+"-"+k+")="+i+(t-k)+1);
					//System.out.println(+i+(t-k)+1);
					}
					k--;
				}
				k=t;
			 res[i]=sum;
			 System.out.println("i="+i+" "+res[i]);
			 System.out.println("-------------------------------");
			}
			
		}
		if(k<0)
		{
			int l=0, r=code.length-1;
			k=k*-1;
		
			for(int i=0;i<code.length;i++)
			{
				int t=k;
				int sum=0;
				while(k>0)
				{
					if(i-(t-k)-1<l) {
					//	System.out.println("if..."+"i="+"("+t+"-"+k+")=");
					//	System.out.println(i+(t-k)+1);
					//	System.out.println(l+k-1);
						System.out.println(code[r-(t-k)]);
						sum=sum+code[r-(t-k)];}
					else {sum=sum+code[i-(t-k)-1];
					//System.out.println(code[i+(t-k)+1]);
					//System.out.println("sum="+sum);
					//System.out.println("else..."+"i="+"("+t+"-"+k+")="+i+(t-k)+1);
					//System.out.println(+i+(t-k)+1);
					}
					k--;
				}
				k=t;
			 res[i]=sum;
			 System.out.println("i="+i+" "+res[i]);
			 System.out.println("-------------------------------");
			}
			
		}
		
	}

}
