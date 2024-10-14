package leetcode16;

public class canPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []flowerbed = {0};
		int n = 1;
		int l=flowerbed.length;
		
		for(int i=0;i<l && n>0;i++)
		{
			if(flowerbed[i]==0)
			{	
				if(i==0)
				{
					if(l!=1 && flowerbed[i+1]==0) 
					{flowerbed[i]=1;	
					n=n-1;}
					if(l==1 && flowerbed[i]==0) 
					{
						flowerbed[i]=1;	
						n=n-1;
					}
				}
				else if(i==l-1)
				{
					if(flowerbed[i-1]==0)
					{flowerbed[i]=1;
					n=n-1;}
				}
				else
				{
					if(flowerbed[i-1]==0 && flowerbed[i+1]==0) 
					{flowerbed[i]=1;	
					n=n-1;
					}
				}
			}
		}
		
		for(int i=0;i<l;i++)
			System.out.print(flowerbed[i]+" ");
		
		System.out.println("********"+n);
		
	}
}
