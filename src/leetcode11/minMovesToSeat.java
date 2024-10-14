package leetcode11;

public class minMovesToSeat {
	
	public static int[] sortedarray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++)
			{
			   if(arr[j]<min)
			   {
				   min=arr[j];
				   index=j;
			   }
			}
			int tmp=arr[i];
			arr[i]=min;
			arr[index]=tmp;
			//System.out.println(arr[i]);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seats= {6,9,1,5};
		int[] students= {1,3,2,6};
		seats=sortedarray(seats);
		students=sortedarray(students);
		int sum=0;
		for(int i=0;i<seats.length;i++)
		{
		 sum=sum+Math.abs(seats[i]-students[i]);	
		}
		
		System.out.println(sum);
	
}
}
