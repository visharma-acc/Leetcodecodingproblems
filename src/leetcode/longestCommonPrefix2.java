package leetcode;

import javax.naming.InitialContext;

public class longestCommonPrefix2 {
	
	public static String getPrefix(String s1,String s2)
	{
		StringBuilder ans=new StringBuilder("");
	 
		 int min=Math.min(s1.length(), s2.length());
		for(int i=0;i<min;)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				ans.append(s1.charAt(i));
				i++;
			}
			else
			{
				break;
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs= {""};
		
        String res=strs[0];
        
        for(int i=1;i<strs.length;i++)
        {
        	res=getPrefix(res,strs[i]);
        	if(res=="")
        	{break;}
        	System.out.println("res is="+res);
        }
        
        
        System.out.println("res is="+res);	
	}		

	
}

