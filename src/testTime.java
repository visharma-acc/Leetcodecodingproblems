
public class testTime {
	
	boolean solution(String time)
	{
		boolean flag;
		
		String[] str = time.split(":", 2);
		if(str.length==2)
		{
			try {
				int HH=Integer.parseInt(str[0]);
				int MM=Integer.parseInt(str[1]);
				
				if (HH>=00 && HH<=23)
				{
					if(MM>=00 && MM<=59)
					{
						flag= true;
					}
					else
					{
						flag=false;
					}
				}
				else
				{
					flag =false;
				}
				
			}
			catch (NumberFormatException e) {
				System.out.println("not a number..");
				flag=false;
			}
			
			
		}
		else
		{
			flag=false;
		}
		
		return flag;
        
	}
	
	public static void main(String[] args) 
	{
		
		testTime ob=new testTime();
		System.out.println(ob.solution("13:58"));
		System.out.println(ob.solution("25:51"));
		System.out.println(ob.solution("02:76"));
	}

}
