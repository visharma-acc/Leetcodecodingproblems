package leetcode5;

public class sumOddLengthSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
		
		int []arr = {1,4,2,5,3};
		int len=arr.length;
		int n=len;
		if((len^1) == (len+1)) n=len-1;
		int l=0,r=n,i=0;
		int total=0;
		while(l<r && n>=1)
		{
			System.out.println("l="+l);
			r=l+n;
			System.out.println("r="+r);
		  	for (i=l; i<r;i++) {
		  		total=total+arr[i];
		  		if(r==len) {if(i==r-1) break;}
		  		else {
		  		l=l+1;
		  		System.out.println("l="+l);
		  		i=l;
		  		}
		  	}
		  	System.out.println("total="+total);
		  //	r=r-1;
		  //	System.out.println("l="+l);
		  //	System.out.println("r="+r);
		  	n=n-2;
		  	System.out.println("n="+n);
		}

	}

}
