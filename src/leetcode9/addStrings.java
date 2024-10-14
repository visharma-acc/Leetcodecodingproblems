package leetcode9;

public class addStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="6913259244", num2="71103343";
        char n1[]=num1.toCharArray();
        char n2[]=num2.toCharArray();
       
        int len1=num1.length();
        int len2=num2.length();
        
        int carry=0;
        
        int len=len1;
        if(len2<len) len=len2;
        char n3[]=new char[len];
        for(int i=len-1;i>=0;i--)
        {
          int t=n2[i]+n1[i]+carry;
          n3[i]=(char)(t%10);
          carry=t/10;
          System.out.print(n3[i]);
        }
       
        
	}

}
