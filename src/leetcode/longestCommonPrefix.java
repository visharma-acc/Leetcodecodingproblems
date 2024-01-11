package leetcode;

public class longestCommonPrefix {

	public static void main(String args[])
	{
		String[] strs= {"ab","ab","ab"};
		
		int len=strs.length;
		String pref="";
		

     int i=0;
    	  for(int j=0;j<len-1;j++)
    	  {
    		  pref="";
    	     int k=Math.min(strs[j].length(),strs[j+1].length());	  
    	     System.out.println("k="+k);
    		  for(int t=0;t<k;t++)
    		  {
    			 String tmp1, tmp2;
    		   
    			 tmp1=strs[j].substring(0,t+1);
    			 tmp2=strs[j+1].substring(0,t+1);
    			 System.out.println(tmp1);
    			 System.out.println(tmp2);
    		    
    			if(tmp1.equals(tmp2))
    			{
    				pref=tmp1;
    			}
    			else
    			{
    				
    			}
    		}
    		if(pref.equals(""))
    		{
    			break;
    		}
    		
    		 System.out.println("i="+j); 
    		 System.out.println("j="+(j+1)); 
    		 System.out.println(("----------------------"));
    		 
    	  
    	 
      }
      System.out.println("common prefix ="+pref);
	}
	
}
