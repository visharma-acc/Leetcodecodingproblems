package leetcode3;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="anagram";
		String t="mangaar";
		
		int arr[]=new int[26];
		for (int i=0;i<s.length();i++)
		{
			int c=s.charAt(i)-97;
			//System.out.println(c);
			arr[c]=arr[c]+1;
		}
		
		for (int i=0;i<t.length();i++)
		{
			int c=t.charAt(i)-97;
			//System.out.println(c);
			if(arr[c]!=0)
			arr[c]=arr[c]-1;
		}
		
		int count=0;
		
		for (int i=0;i<26;i++)
		{
			count+=arr[i];
		}
		
		System.out.println(count);

	}

}
