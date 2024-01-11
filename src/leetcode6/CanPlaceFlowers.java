package leetcode6;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []flowerbed = {0,0,0};
		int n = 1;
		int i=0, len=flowerbed.length;
		while(i<len-1 && n>0)
		{
		  if(flowerbed[i]==1)
		  {
			  i=i+2;
		  }
		  else
		  {
			  if(i+1<=len && flowerbed[i+1]==0 )
			  {
				   
				  flowerbed[i]=1;
				  i=i+2;
				  n=n-1;
				  System.out.println(n);
			   }
				else
			    { 
					i=i+1;
				}
		      }
				System.out.println(i);  
			}
		
		if(i==len-1 && len==0)
		{
			if(flowerbed[i]==0) 
			{
				flowerbed[i]=1;
				n=n-1;
			}
		}
		
		
		System.out.println(n);
		}
		

	}


