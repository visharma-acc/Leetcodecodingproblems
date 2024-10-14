package leetcode11;

public class findPermutationDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde",  t = "edbac";
		int sum=0;

		int arr []=new int [26];
		for (int i=0;i<26;i++) arr[i]=-1;
		
		for(int j=0; j<s.length();j++)
		{
			int ch=s.charAt(j)-97;
			arr[ch]=j;
		}
		
		for(int j=0; j<t.length();j++)
		{
			int ch=t.charAt(j)-97;
			arr[ch]= Math.abs(arr[ch]-j);
		}
		
		for (int i=0;i<26;i++)
		if(arr[i]!=-1)sum+=arr[i];	
			
		System.out.println(sum);
	}

}
