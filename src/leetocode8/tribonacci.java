package leetocode8;

public class tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2
		int n=4;
		int [] fn=new int[38];
		fn[0]=0;
		fn[1]=1;
		fn[2]=1;
		
		for(int i=0;i<35;i++)
		{
		 fn[i+3]=fn[i]+fn[i+1]+fn[i+2];
		 System.out.println(fn[i+3]);
		}
		
		
		
	}

}
