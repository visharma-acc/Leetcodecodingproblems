package leetcode10;

public class customSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/custom-sort-string/
		
		String order = "cba", s = "abcd";
		
		int l=s.length();
		char [] ch=new char[l];
		
		int [] arr=new int[26];
		int count=0;
		
		for(int i=0;i<l;i++)
		{
			char c=s.charAt(i);
			int t=c-97;
			System.out.println(t);
			arr[t]=arr[t]+1;
		}
		
		for(int i=0;i<order.length();i++)
{
				int c=order.charAt(i)-97;
				if(arr[c]!=0)
				{
					int k=arr[c];
					while(k>0)
					{	
					 char tmp=(char)(97+c);	
					ch[count]=tmp;
					System.out.println(ch[count]);
					count++;
					k--;
					}	
				 arr[c]=0;	
				}
}
		
		System.out.println(new String(ch));
		System.out.println(count);
	
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=0)
			{
				int k=arr[i];
				while(k>0)
				{	
				 char tmp=(char)(97+i);	
				 ch[count]=tmp;
				 count++;
				 k--;
				}
			}
			if(count>=l)break;
		}
		
		System.out.println(new String(ch));
		System.out.println(count);


	}

}
