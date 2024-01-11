package tester;

public class numJewelsInStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels = "aA", stones = "aAAbbbb";
		int count=0;
		for(int i=0;i<stones.length();i++)
		{
			for(int j=0;j<jewels.length();j++)
			{
				if(stones.charAt(i)==jewels.charAt(j))
					count++;
				
			}
		}

		System.out.println(count);
		
		String columnTitle="FXSHRXW";
		double t=0;
        int len=columnTitle.length();
		
		
		for(int j=0;j<len;j++)
       {
			t+=Math.pow(26, (len-j-1))*(columnTitle.charAt(j)-65+1);        
       }
		
		int x=(int) t;
		
		System.out.println(x);
		
		String s = "Test1ng-Leet=code-Q!";
		//Qedo1ct-eeLg=ntse-T!
		
		char cstr[]=s.toCharArray();
		char ctsr1[]=new char[cstr.length];
		int j=cstr.length-1;
		int g=0;

		for(int i=0;i<cstr.length;)
		{
			int ch=cstr[i];
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))      
			{
			   int last=cstr[j];
			   if((last>=65 && last<=90) || (last>=97 && last<=122))
			   {
				   ctsr1[g]=cstr[j];
				   g++;
				   j--;
				   i++;
			   }
			   else
			   {
				   j--;
			   }
			   
			   System.out.print(ctsr1[g]); 
			}
			else
			{
				 ctsr1[g]=cstr[i];
				 System.out.print(ctsr1[g]);
				 g++;
				 i++;
				
			}
			
			//System.out.print(ctsr1[g]);
		}
	
		String s1= new String(ctsr1);
		
		System.out.println("--------------------");
		
		for(int k=0;k<cstr.length;k++)
		{
			System.out.print(ctsr1[k]);
		}
		
		System.out.println(s1);
		
		//System.out.println(str);
		
	}

}
