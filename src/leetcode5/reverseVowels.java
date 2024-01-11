package leetcode5;

public class reverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " apG0i4maAs::sA0m4i0Gp0";
		
		char[] str=s.toCharArray();
		
		int len=s.length();
		
		int l=0, r=len-1;
		
		while (l<r)
		{
			System.out.println(l);
			System.out.println(r);
			if (str[l]=='a' || str[l]=='e' || str[l]=='i' || str[l]=='o' || str[l]=='u' || str[l]=='A' || str[l]=='E' || str[l]=='I' || str[l]=='O' || str[l]=='U' )
			{
				System.out.println("inside if");
				if (str[r]=='a' || str[r]=='e' || str[r]=='i' || str[r]=='o' || str[r]=='u' ||
		                str[r]=='A' || str[r]=='E' || str[r]=='I' || str[r]=='O' || str[r]=='U')
				{
					System.out.println("swapning vowels..e");	
					char t=str[l];
					str[l]=str[r];
					str[r]=t;
					l++;
					r--;
				}
				else r--;
			}
			else
			l++;	
		}
		
		String rev =new String(str);
		
		System.out.println(rev);

	}

}
