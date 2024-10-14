package leetcode14;

public class minimizedStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabc";
		int freq[]=new int[26];
		int minStringLenght=0;
				
		for(int i=0;i<s.length();i++)
		{
			int c=(int)s.charAt(i)-97;
			if(freq[c]==0)
			{	
			freq[c]=1;
			minStringLenght++;
			}
		}
		
		System.out.println(minStringLenght);
	}

}
