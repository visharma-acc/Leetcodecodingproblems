package leetcode3;

public class Anagram2 {

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
			int c1=t.charAt(i)-97;
			//System.out.println(c);
			if(arr[c1]!=0)
			arr[c1]=arr[c1]-1;
		}
		
	
		
		
		for (int i=0;i<26;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
