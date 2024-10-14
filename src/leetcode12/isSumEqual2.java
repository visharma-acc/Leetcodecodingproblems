package leetcode12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class isSumEqual2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstWord = "jfjfjbcj", secondWord = "i", targetword="jfjfjbdh";
		 int l1=firstWord.length();
		 int l2=secondWord.length();
		 int len=Math.max(l1, l2)+1;
		 int ch[]=new int[len];
		 int carry=0;
		 
		 for(int i=l1-1;i>=0;i--)
		 { int a=(int)firstWord.charAt(i)-97;
		   ch[len-1]=a; 
		   System.out.print(ch[len-1]);
		   len--;
		 }
		 System.out.println("***********");
		 
		 len=Math.max(l1, l2)+1;
		
		 
		 for(int i=l2-1;i>=0;i--)
		 { int b=(int)secondWord.charAt(i)-97;
		   int a=ch[len-1];
		   ch[len-1]=(a+b+carry)%10; 
		   System.out.println(ch[len-1]);
		   carry=(a+b+carry)/10;
		   System.out.println("carry= "+carry);
		   len--;
		 }
		 
		 System.out.println("len="+len);
		 
		 ch[len-1]=ch[len-1]+carry;
		 
		 for(int k=0;k<ch.length;k++)
		 {
			 System.out.print(ch[k]+" ");
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
