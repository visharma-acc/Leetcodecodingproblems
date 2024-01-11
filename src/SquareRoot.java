import java.text.DecimalFormat;
import java.util.HashMap;

public class SquareRoot {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static double sqrt(int x)
	{

	    
        if(x==0)
            return 0;
        
		
		DecimalFormat df = new DecimalFormat("#.#####");
		double num=Double.parseDouble(df.format(x));
		double fx=(num/2);
		
		
        
		
		while(true)
		{
			System.out.println("fx=="+fx);
			double fy=(fx+(num/fx))/2;
			//fy=Double.parseDouble(df.format(fy));
			if(fx==fy)
			{
				return fx;
			}
			System.out.println("fy=="+fy);
			fx=fy;
			
		}
			
		
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res=(int) (sqrt(2147483647));
		
		System.out.println(res);
		
		HashMap<Integer, Integer> hs=new HashMap<>();
		
		int x=36;
		int c=0, i=2;
		
		while(x>0)
		{
			if(x%i==0)
			{
				c++;
				x=x/i;
				//System.out.println(x);
				
			}
			else
			{
				//x=x/i;
				hs.put(i, c);
				i++;
				c=0;
				if(x==1)
					break;
			}
		}
		
		System.out.println(hs);
		

	}
	


}
