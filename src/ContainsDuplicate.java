import java.util.HashMap;

public class ContainsDuplicate {
	
public static void main(String args[])
{
	
    boolean flag=false;
    
    int nums[] = {1,1,1,3,3,4,3,2,4,2};
    
    HashMap<Integer, Integer> hm=new HashMap<>();
      
      for (int i=0;i<nums.length;i++)
      {
        if(hm.containsKey(nums[i]))
        {
            flag=true;
            break;
        }
         else
             
         {
             hm.put(nums[i], 1);
         }
  
      
      }
  System.out.println(flag);
}

}
