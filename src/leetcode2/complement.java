package leetcode2;

public class complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
	
		int y=589696;
		int c=0;
		
		int digit=(int) ((Math.log10(y)) +1);
		 

       System.out.println(digit);
       String s=String.valueOf(y);
       System.out.println(s.length());
       
       while (y>0)
       {
    	   y=y/10;
    	   c++;
       }
       
		System.out.println(c);
		
		System.out.println(~x);

	}

}
