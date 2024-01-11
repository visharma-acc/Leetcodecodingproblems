package leetcode7;

public class numOfSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {2,2,2,2,5,5,5,8};
		int k = 3, threshold = 4;
		int l=arr.length;
		int sum=0, t=0;
		for (int i=0;i<k;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println(sum);
		for(int i=k;i<l;i++)
		{
		  int avg=sum/k;
		  System.out.println("avg="+avg);
		  if(avg>=threshold)t++;
		  sum=sum-arr[i-k]+arr[i];
		  System.out.println("sum="+sum);
		}
		if(sum/k>=threshold)t++;
		
		System.out.println(t);
	}

}
