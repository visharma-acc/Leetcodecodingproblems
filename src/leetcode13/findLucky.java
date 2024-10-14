package leetcode13;

public class findLucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int []arr = {1,3,2,3,2,3,3};
	int [] tp=new int [501];
	int n=0;
	
	for(int i=0;i<arr.length;i++)
	{
		tp[arr[i]]=tp[arr[i]]+1;
	}
	
	
	System.out.println("----------------------");
	
	int max=0;
	
	for(int i=1;i<tp.length;i++)
	{
		if((tp[i]^i)==0)
			max=Math.max(max, tp[i]);
	}
	
	System.out.println("----------------------");
	
	System.out.println(max);
	
	}

}
