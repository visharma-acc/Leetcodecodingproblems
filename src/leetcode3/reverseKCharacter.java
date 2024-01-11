package leetcode3;

public class reverseKCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = "abcdefg";
	int k = 8;
	int k2=2*k;
	int len=s.length();
	
	char ch[]=s.toCharArray();
	for(int i=0;i<len;i=i++)
	{
		int j=i;
		int l=j+k-1;
		System.out.println("j= "+ j+" l= "+l);
		if(l>=len)
			l=len-1;
		while(j<l && l<len)
		{
			char temp=ch[j];
			ch[j]=ch[l];
			ch[l]=temp;
			j++;
			l--;
		}
		i=i+k2;
	}
	
	String s1=new String(ch);
	System.out.println(s1);
	
	}

}
