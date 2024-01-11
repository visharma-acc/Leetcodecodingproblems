import java.util.HashMap;
import java.util.Map;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int [] nums= {1,2,5,1,2};
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		
		for(int i=0; i<nums.length;i++)
		{
		
			if(hm.containsKey(nums[i]))
			{	
			int c=hm.get(nums[i]);	
			hm.put(nums[i],c+1);
			}
			else
			{
				hm.put(nums[i],1);
			}
		}
	
	
	for (Map.Entry<Integer,Integer> entry : hm.entrySet())
        System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
	

}
}
