
public class BSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {};
		int target=7;
		
		System.out.println(search(nums, target));
		

	}

	 public static int search(int[] nums, int target)
	 {
		 int first=0;
		 int last=nums.length-1;
		 int middle;
		 int index=-1;
		 
		 while(first<=last)
		 {
			 middle=(first+last)/2;
			 System.out.println("first="+first);
			 System.out.println("middle="+middle);
			 System.out.println("last="+last);
			 if(target==nums[middle])
			 {
				 return middle;
				 //index= middle;
			 }
			 else if(target>nums[middle])
			 {
				 first=middle+1;
			 }
			 else
			 {
				 last=middle-1;
			 }
			 if(first==last && target!=nums[first])
			 {
				 return -1;
			 }
			 
			 
		 }
		 
		return -1;
		 
	 }
	
}
