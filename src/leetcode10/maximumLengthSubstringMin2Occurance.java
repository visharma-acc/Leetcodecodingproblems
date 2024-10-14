package leetcode10;

import java.util.Arrays;

public class maximumLengthSubstringMin2Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aacdfgbaba";
		int arr []= new int [26];
		int max=0;
		int c=0;
		
		int l=0 , r=s.length();
		int j=0;
		while(l<r)
		{
			int t=(int)s.charAt(l)-97;
			System.out.print(t);
			arr[t]=arr[t]+1;
			System.out.println(" "+arr[t]);
			if(arr[t]>2)
			{
				System.out.println("l="+l);
				System.out.println("c="+c);
				//int sz=l-c;
				if(max<c)
					max=c;
				  System.out.println("max set");
				  System.out.println("counter reset");
				  System.out.println("Array reset");
				    Arrays.fill(arr, 0);
				    c=0;
				    j=j+1;
				    l=j;
			}
			else
			{
				l++;
				c++;
			}
		}
		
		System.out.println("l="+l);
		System.out.println("c="+c);
		//int sz=l-c;
		if(max<c)
			max=c;
		  System.out.println("max set");
		
		System.out.println(max);

	}

}
