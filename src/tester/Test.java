package tester;

public class Test {
	
	
	public static int fn(int w, int o)
	{
		int result =w;
		 int x=0;
	   if(w==o)
		   x=1;
	   else
		  x=w/o;
	   
	   result=result+x+fn(x,o);
	   System.out.println(result);
	   
	   return result;
	   
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fn(15,3));

	
	}

}
