package leetcode10;

public class StringisAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aa", t = "b";
		boolean flag=true;
			
		int [] arr=new int [26];
		int tm=0;
		for(int i=0;i<s.length();i++)
		{	
			tm=tm^(s.charAt(i));
			int index=(int)s.charAt(i)-97;
			arr[index]=arr[index]+1;
		}
		
		for(int i=0;i<t.length();i++)
		{	
			tm=tm^t.charAt(i);	
			int index=(int)t.charAt(i)-97;
			arr[index]=arr[index]-1;
		}
		
		System.out.println(tm);
		
		for(int i=0;i<26;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<s.length();i++)
		{
			int index=(int)s.charAt(i)-97;
			if(arr[index]!=0) { flag=false; break;}
		}
		
		if(flag==true)
		for(int i=0;i<t.length();i++)
		{
			int index=(int)t.charAt(i)-97;
			if(arr[index]!=0) { flag=false; break;}
		}
		
		System.out.println(flag);
		
	}

}
