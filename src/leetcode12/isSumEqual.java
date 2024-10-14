package leetcode12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class isSumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstWord = "h", secondWord = "fhjfdghj", targetword="fhjfdgig";
		 int l1=firstWord.length();
		 int l2=secondWord.length();
		 int len=Math.max(l1, l2);
		 int ch[]=new int[len];
		 int carry=0;
		 for(int i=len-1;i>=0;i--)
		 {
			int a=0, b=0;
			if(l1-1>=i)
			{
				a=(int)firstWord.charAt(i)-97;
			}
			if(l2-1>=i)
			{
				 b=(int)secondWord.charAt(i)-97;
			}
			int c=(a+b+carry)%10;
			System.out.println(a+" "+b+" "+c);
			carry=(a+b+carry)/10;
			ch[i]=c;
			l1=l1-1;
			l2=l2-1;
		 }
		 System.out.println("---------------");
		 //System.out.println(new String(ch));
		 int sumofab=Integer.parseInt(Arrays.stream(ch).mapToObj(String::valueOf).collect(Collectors.joining()));
		 
		 ch=new int[targetword.length()];
		 
		 for(int j=ch.length-1;j>=0;j--)
		 {
			 ch[j]=(int)targetword.charAt(j)-97;
		 }
		 
		 int target=Integer.parseInt(Arrays.stream(ch).mapToObj(String::valueOf).collect(Collectors.joining()));
	//	System.out.println(Integer.parseInt(Arrays.stream(ch).mapToObj(String::valueOf).collect(Collectors.joining())));
		 System.out.println(sumofab+" "+target);
		 if((sumofab^target)==0)
			 System.out.println(true);
		 
		
		System.out.println(8&1);
		 
		 System.out.println(8&8);
	}

}
