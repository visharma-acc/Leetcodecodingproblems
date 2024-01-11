import java.util.Arrays;

public class StringNumberSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] strNumberArray = {
		            "1", "11", "121", "112", "13", "101", "115"};
		 int [] Number= new int[strNumberArray.length];
		 
		 int i=0;

		 for (String str: strNumberArray)
		 {
			 try
			 {
				int temp=Integer.parseInt(str) ;
				Number[i++]=temp; 
			
			 }
			 catch (NumberFormatException e) {

				 System.out.println("not a number..");
				 e.printStackTrace();
			}
			 
			 catch (ArrayIndexOutOfBoundsException e) {

				 System.out.println("not a number..");
				 e.printStackTrace();
			}
			  
		 }
		 Arrays.sort(Number);
		 System.out.println(Arrays.toString(Number));
		 
	}

}
