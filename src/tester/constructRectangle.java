package tester;

public class constructRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area = 37;
		int n[]= {0,0};
		int w=(int) Math.sqrt(area),l=w;
		int res=0;
		System.out.println("w="+ w+"l="+l);
		res=w*l;
		System.out.println(res);
		int i=0;
		
		while(res!=area)
		{
			if(res<area)
			{
				l++;
			}
			if(res>area)
			{
				w--;
			}
			res=w*l ;
			System.out.println("res="+res);
			if(res==area)
				break;
			
			
			
			//if(i==200)
			//	break;
			
			i++;
			
			System.out.println("l="+ l+" w="+w);
		
		}
		
      System.out.println("w="+ w+" l="+l);
		
	}

}
