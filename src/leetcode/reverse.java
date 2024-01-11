package leetcode;

public class reverse {

public static void main(String args[])
{
	int x=1534236469;
	int rev=0;
	boolean  flagSign=false;
	if(x<0)
	{	
      flagSign=true;
	} 
	String s=Integer.toString(x);
	try
	{
	  	StringBuilder stringBuilder=new StringBuilder();
	  	stringBuilder.append(s);
	  	String tmp;
	  	int len=stringBuilder.length();
	  	tmp=stringBuilder.reverse().toString();
	  	if(tmp.charAt(len-1)=='-')
	  	{
	  	 System.out.println("inside if");	
	  	  tmp=stringBuilder.substring(0, len-1);
	  	}
	  	
	    rev=Integer.parseInt(tmp);
	    if(flagSign)
	    	rev=-1*rev;
	  	
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		
	}
	catch (NumberFormatException e)
	{
		
	}
	
	System.out.println(rev);
	
}	
	
}
