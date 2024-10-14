package leetcode9;

public class TraverseCircularReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []code = {2,4,9,3,6,7};
		int index =0;
		int k=2;
		int n=code.length;
		int [] res=new int[n];
		
		for(int i=0;i<n;i++)
		{
		   for(int j=1;j<=k;j++)
		   {
			  int m=(i-j)%n; 
			  if(m<0)m=m+n;
			 // System.out.println(m);
		      int t= code[m];
		     System.out.println(t);
		   }
		   System.out.println("******");
		}

	}

}
