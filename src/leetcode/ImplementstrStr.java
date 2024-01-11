package leetcode;

public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String haystack="aaaaa";
		String needle="bba";
		
		int len=haystack.length();
		
		int index=-1;
		
		int l=needle.length();
		
		
		
		for(int i=0;i+l<=len;i++)
		{
			if(haystack.substring(i, l+i).equals(needle))
			{
				index=i;
				break;
			}
		}
		
		System.out.println("index="+index);

	}

}
