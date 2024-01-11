import javax.swing.ImageIcon;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s = {"h","e","l","l","o"};
		int i=0,j=s.length-1;
		while(i<=j)
		{
			String temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;j--;
		}
		for(int k=0;k<s.length;k++)
			System.out.print(s[k]);
		


		
		int [][]image = {{1,1,0},{1,0,1},{0,0,0}};
		System.out.println();
	
		  int n=image.length;
			for(int k=0;k<n;k++)
			{
				for(int l=0;l<n;l++)
				{	
					System.out.print(image[k][l]);
					//image[k][l]=image[k][l]^1;
				}	
				System.out.println();
			}
			
			for(int k=0;k<n;k++)
			{
				int st=0, t=n-1;
				while(st<t)
				{	
					int temp=image[k][st];
					image[k][st]=image[k][t];
					image[k][t]=temp;
					st++;
					t--;
					//System.out.print(image[k][l]);
					//image[k][l]=image[k][l]^1;
				}	
				System.out.println();

				for(int l=0;l<n;l++)
				{	
					
					image[k][l]=image[k][l]^1;
				}	
			}
			
			for(int k=0;k<n;k++)
			{
				for(int l=0;l<n;l++)
				{	
					System.out.print(image[k][l]);
					//image[k][l]=image[k][l]^1;
				}	
				System.out.println();
			}
		
	}

}
