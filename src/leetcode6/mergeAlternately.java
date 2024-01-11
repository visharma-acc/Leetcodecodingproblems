package leetcode6;

public class mergeAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "ab", word2 = "pqrs";
		int len1=word1.length();
		int len2=word2.length();
		char str[]=new char[len1+len2];
	    int c,i=0,j=0;
		if(len1>len2)
			c=len2;
		else
			c=len1;
		while (i<c) {
			str[j++]=word1.charAt(i);
			str[j++]=word2.charAt(i);
			i++;
		}
		if(len1>len2)
		{
			while(j<len1+len2) 
			{str[j++]=word1.charAt(i);
			 i++;
			}
		}
		
		if(len2>len1)
		{
			while(j<len1+len2) 
			{str[j++]=word2.charAt(i);
			 i++;
			}
		}
		
		System.out.println(i+" "+j+" "+str.length);
		System.out.println(str);
		String s=new String(str);
		System.out.println(s);
	
	}

}
