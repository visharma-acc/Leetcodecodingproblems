package leetcode7;

public class longestPalindrome {
	
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
		
		String s = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
		System.out.println(s.substring(0, 1));
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<=l;j++)
			{
				System.out.println(s.substring(i, j));
				int t=palindrome(s.substring(i, j));
				if(t>max) max=t;
				System.out.println("t="+t+" max"+max);
			}
		  	
		}
		
		System.out.println(max);
	}
}
