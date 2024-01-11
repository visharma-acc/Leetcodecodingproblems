import java.util.ArrayList;
import java.util.HashSet;

public class SolutionTest
{
	
	public static void main(String args[])
	{
		//String s = "abcabcbb";
		String s = "pwwkew";
		int l=s.length();
		char c[]=new char[l];
		int max=0;
		ArrayList<String> list=new ArrayList();
		HashSet<String> hs=new HashSet<>();
		HashSet<Character>hc=new HashSet();
		String temp;
		System.out.println(s.length());
		
		for (int i=0; i<l;i++)
		{
			c[i]=s.charAt(i);
		}
		
		int t=0;
		int index=0;
		int c1=0;
			for (int j=index;j<l;j++)
			{
			 System.out.println(hc);	
			 if(!hc.contains(s.charAt(j)))
			 {
				 System.out.println("j="+j);
				// System.out.println(s.charAt(3));
				 System.out.println("charater si ="+s.charAt(j));
				 hc.add(s.charAt(j));
				 c1++;
				 if(j==(l-1))
				 {
					// System.out.println("inside inner if--");
					// System.out.println("index="+index+" t="+t);
					 hs.add(s.substring(index, t+1));
					 System.out.println(list);
					 
				 }
			 }
			 else
			 {
				// System.out.println("c1="+c1);
				 t=index+c1;
	
				 System.out.println("index="+index+" t="+t);
				 hs.add(s.substring(index, t));
				 System.out.println(list);
				 System.out.println(hc);
				 System.out.println("******************************************");
				
				 
				 index=j;
				 --j;
			//	 System.out.println("index="+index);
			//	 System.out.println("t="+t);
			//	 System.out.println("j="+j);
				 c1=0;
				 hc.clear();
				 
			 }
			
			
			
			}
		
		
		System.out.println(hs);
		
		
		
		
		
		
	}
	
}
