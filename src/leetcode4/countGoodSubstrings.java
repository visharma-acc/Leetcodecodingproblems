package leetcode4;

public class countGoodSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/

		String s = "aababcabc";
		char str[]=s.toCharArray();
		int count=0;
		
		for (int i=0; i<str.length-2;i++)
		{
			if((str[i]^str[i+1])!=0 && (str[i]^str[i+2])!=0 && (str[i+1]^str[i+2])!=0)
				count++;
		}
		
		System.out.println(count);
	}

}
