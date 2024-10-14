package leetcode13;

import com.mysql.cj.x.protobuf.MysqlxConnection.Capabilities;

public class redistributeApples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []capacity = {4,3,1,5,2};
		int []apple = {1,3,2};
		int sum=0,i,j;
		
		for(int k=0;k<apple.length;k++)
		{
			sum+=apple[k];
		}
		
		for( i=0;i<capacity.length-1;i++)
		{
			for( j=i+1;j<capacity.length;j++)
			{
				if (capacity[i]<capacity[j])
				{
					capacity[i]=capacity[i]^capacity[j];
					capacity[j]=capacity[i]^capacity[j];
					capacity[i]=capacity[i]^capacity[j];
				}
			}
			sum=sum-capacity[i];
			if(sum<=0) break;
		}
		
		System.out.println("boxs is "+ ++i);
		
		for(int i1=0;i1<capacity.length;i1++)
			 System.out.println(capacity[i1]);
	}      

}
