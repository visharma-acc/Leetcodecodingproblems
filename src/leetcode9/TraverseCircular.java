package leetcode9;

public class TraverseCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []code = {2,4,9,3,6,7};
		int index =2;
		int n=code.length;
		
		for(int i=0;i<n;i++)
		{
		  	System.out.println(code[(index+i)%n]);
		}

	}

}
