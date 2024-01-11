package leetcode7;

public class longestPalindrome2 {
	
	public static int palindrome(String st)
	{
		char[] str=st.toCharArray();
		int l=str.length;
		System.out.println(st);
		int i=0,j=l-1;
		while(i<=j)
		{
		  if(str[i]==str[j])
		  {
			  i++;
			  j--;
		  }
		  else
		  {
			  return 0;
		  }
			  
		}
		return l;
	}

	public static void main(String[] args) {
		
		int max=0;
		
		String s = "babad";
	//	System.out.println(s.substring(0, 1));
		int l=s.length();
	    char c[]=s.toCharArray();
		int i=0,j=l-1;
		int start=0;
		int t=0;
		while(i<=j)
		{
		  if(c[i]==c[j])
		  {
			  i++;
			  j--;
			  t++;
		  }
		  else
		  {
			  j--;
		  }
		  //System.out.println("i="+i+" j="+j );
		  //System.out.println(t);
		  if(i>j)
		  {
			  if(t>max)max=t;
			  System.out.println(s.substring(i-t,i+t));
			  if (s.substring(i-t,i+t).length()==l) break;
			  if(max>(j-start)) break;
			  start=start+1;
			  i=start;
			  j=l;
			  System.out.println("loop reset...");
		  }

	}
		
		
	System.out.println("i="+i+" j="+j );	
	}
	
}
