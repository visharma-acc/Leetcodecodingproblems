package leetcode10;

public class addStrings {
	
	public static void main(String ars[])
	{
		 String	num1 = "666", num2 = "77";	
		 
		 int l=Math.max(num1.length(), num2.length());
		 char [] ch=new char[l+1];
		 int n1=num1.length()-1;
		 int n2=num2.length()-1;
		 int t1,t2,carry=0;
		 
		 for(int i=l;i>=0;i--)
		 {
			 if(n1<0) 
				 { t1=0;}
			 else
			 {t1=num1.charAt(n1)-48; 
			 System.out.println(t1);
			 }
			 if(n2<0) 
			 { t2=0;}
		     else
		     {t2=num2.charAt(n2)-48; 
		     System.out.println(t2);}
			 int t=(carry+t1+t2)%10;
			 System.out.println(t);
			 ch[i]=(char)(t+48);
			 System.out.println("ch["+i+"] "+ch[i]);
			 carry=(carry+t1+t2)/10;
			 System.out.println("carry="+carry);
			 n2--;
			 n1--;
		 }
		 
		 for(int i=0;i<ch.length;i++)
		 {
			 System.out.print(ch[i]);
		 }
		 
		 System.out.println();
		 
		 if(ch[0]=='0')
			 System.out.println(new String(ch).substring(1));
		 else
			 System.out.println(new String(ch));
		
	}
	


}
