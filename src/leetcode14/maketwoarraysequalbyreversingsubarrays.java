package leetcode14;

public class maketwoarraysequalbyreversingsubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []target = {2,3}, arr = {6,7};
		int xr=0;
		
		System.out.println(6^7);
		
		for(int i=0;i<target.length;i++)
		{
		  System.out.println(target[i]^arr[i]);	
		  xr^=target[i]^arr[i];	
		  System.out.println(xr);
		}
		
		System.out.println(xr);

	}

}
