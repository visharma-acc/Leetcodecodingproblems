package leetcode15;

public class pivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int nums[] = {1,7,3,6,5,6};
		int nums[] = {1,2,3};
		
		int l=nums.length;
		int []leftsum=new int [l];
		int rightsum[]=new int[l];
		int flag=0;

		
		for( int i=0,j=l-1;i<l-1 && j>0;i++,j--)
		{
			leftsum[i+1]=leftsum[i]+nums[i];
			rightsum[j-1]=rightsum[j]+nums[j];
		}
		
		//System.out.println(i+" "+j);
		
		for(int i1=0;i1<l;i1++)
		{	
			System.out.print(leftsum[i1]+" ");
			System.out.print(rightsum[i1]+" ");
			
			if(leftsum[i1]==rightsum[i1]) 
			{	flag=1;
			    break;
			}
				
			System.out.println();
		}	
		
	
		
		System.out.println();
		
		for(int i1=l-1;i1>=0;i1--)
			System.out.print(rightsum[i1]+" ");
		
	}

}
