package leetcode14;

public class productExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {-1,1,0,-3,3};
		
		int [] dppresum=new int[nums.length];
		int [] dpsufsum=new int[nums.length];
		
		dppresum[0]=1;
		dppresum[1]=nums[0];
		
		dpsufsum[0]=nums[1];
		
		System.out.println("prefix product");
		
		System.out.print(dppresum[0]+" "+dppresum[1]+" ");
		
		for(int i=2;i<nums.length;i++)
		{
			dppresum[i]=dppresum[i-1]*nums[i-1];
			System.out.print(dppresum[i]+" ");
			dpsufsum[0]=dpsufsum[0]*nums[i];
		}
		System.out.println();
		System.out.print(dpsufsum[0]);
		
		dpsufsum[nums.length-1]=1;
		
		System.out.println("suffix product");
		
		//System.out.print(dpsufsum[nums.length-1]+" ");
		
		for(int i=nums.length-2;i>=0;i--)
		{
			dpsufsum[i]=dpsufsum[i+1]*nums[i+1];
		//	System.out.print(dpsufsum[i]+" ");
		}
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(dpsufsum[i]+" ");
		}
		
		System.out.println("result product");
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=dppresum[i]*dpsufsum[i];
			System.out.print(dppresum[i]*dpsufsum[i]+" ");
		}
		
		System.out.println(1|1);
	}

}
