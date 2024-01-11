package tester;

public class Puzzle {
	
	
	public static int  fn(int wrp, int o, int c)
	{
		int s=0;
		int rem=0;
		
		
		
		if(wrp>0)
		{
			rem=wrp%o;
			System.out.println("remainder is +"+rem);
			c=c+rem;
			System.out.println("value of c is"+c);
			wrp=wrp/o;
			s=s+wrp+fn(wrp, o,c);
		}
		else
		{
			if(c>=o)
			{
				wrp=c;
				wrp=wrp/o;
				c=0;
				s=s+wrp+fn(wrp,o,c);
				
			}
		}
		
		
		System.out.println(" value of s is "+s);
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=15 , r=1, of=3;
		int i=input/r;
		
		int wrp=i;
		int s=0;
		int rem=0;
		int c=0;
		
		while(wrp>0)
		{	
		  rem=wrp%of;	
		  c+=rem;
		  System.out.println("rem is "+rem);
		  wrp=wrp/of;
		 // wrp=wrp+rem;
		  System.out.println("wrp is "+wrp);
		  s=s+wrp;
		  System.out.println("s is "+s);
		  
		  if(wrp==0)
		  {
			  if(c>=of)
			  {  
				  wrp=c;
				  c=0;
			  }	  
			  else
				 break; 
		  }
			  
		  
		
		}
		
		System.out.println("total is ="+ (i+s));
		
		System.out.println(fn(15,3,0 ));
		


	}

}
