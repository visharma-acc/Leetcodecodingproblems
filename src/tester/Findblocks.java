package tester;

public class Findblocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] blocks= {1,1};
		int i=0,j=0;

        int start=0;
        int len=blocks.length;
        
        while(start+1<len)
        {
        	if(blocks[start+1]>=blocks[start])
        	{
        		start++;
        	}
        	else
        	{
        		start++;
        		break;
        	}
        }

        
        System.out.println(start);
        
        i=start;
        j=start;
        
        int max=start;
        
        boolean flag1=true, flag2=true;
        
        while(flag1 || flag2)
        {
        	if((i-1)>=0)
        	{	
        	if( blocks[i-1]>=blocks[i])
        		i--;
        	else
        		flag1=false;
        	}
        	else
        	{
        		flag1=false;
        	}
        	if((j+1)<len)
        	{	
        	if( blocks[j+1]>blocks[j])
        		j++;
        	else
        		flag2=false;
        	}
        	else
        	{
        		flag2=false;
        	}
        	
        }
		
     
        if(max<(j-i+1))
        	max=j-i+1;
        
  
        System.out.println(max);
		
	}
	

}
