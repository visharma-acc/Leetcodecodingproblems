import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "anviaj";
	    int max=0;
	    int n=s.length();
	    
	   System.out.println("lenght is +"+n);
        
	    
	    HashSet<Character> hs=new LinkedHashSet<Character>();
	    int i=0;
	    int k=0;
	    while (i<n)
	    {
	      int j=i;	
	      while(j<n)
	      {
	    	if(!hs.contains(s.charAt(j)))
	    			{
	    		      hs.add(s.charAt(j));
	    		      System.out.println(hs.size());
	    		      j++;
	    			}
	    	else
	    	{
	    		k=hs.size();
	    		System.out.println("intial size="+k);
	    		hs.clear();
	    		break;
	    	}
	      }
	      System.out.println("outside outer while");
	      if(k==0 && hs.size()!=0)
	      {
	    	  k=hs.size();
	      }
	      max=Math.max(max, k);
		  System.out.println("max="+max);  
		 // ++i;
		 ++i;
	  System.out.println("max="+max);  
	}

	}
}
