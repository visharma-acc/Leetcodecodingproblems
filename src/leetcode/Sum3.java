package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Sum3 {

	public static boolean flag=false;
	
	public static int[] Sum2 (int n , int nums[],int target , int index)
	{ 
		int ar[]=new int[2];
		
		System.out.println("value of n is"+n);
		System.out.println("value of target is"+target);
		PrintArray(nums);
		System.out.println("value of  index is "+index);
		//n =2
		//target = -2
		// 2+x=-2
		//x=4
		// 2-2=0
		
	  int l=nums.length-1;
		
	  for(int i=0;i<l;)
	  {
		  if(nums[i]+nums[l-i-1]==target)
		  {
			  System.out.println("inside sum funtion-----");
			  System.out.println(nums[i]);
			  System.out.println(nums[l-i]);
			  System.out.println("i is "+i);
			  System.out.println("l-i is "+(l-i));
			  
			//  ar[0]=n;
			 // ar[1]=nums[i];
			  ar[0]=i;
			  ar[1]=l-i;
			  flag=true;
			 break;
		  }
		  else if(nums[i]+nums[l-i]<target)
		  {
			i++;  
		  }
		  else
		  {
			 l--;
		  }
	  }
	  return ar;
	}
	
	 public static void PrintArray(int nums[])
	 {
		 for(int i=0;i<nums.length;i++)
			 System.out.print(nums[i]+" ");
		 
	 }
	
	 public static void swap(int nums[],int i , int j)
	 {
		//int t=nums.length;
		int temp=nums[j];
		nums[j]=nums[i];
		nums[i]=temp; 
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int nums[]= {3,0,-2,-1,1,2};
		// [3,0,-2,-1,1,2]
		// swap 2,-1,-1,0,1,-4
		// {-1,-2,1,2}
		
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		//HashSet<ArrayList<Integer>> l1=new LinkedHashSet<ArrayList<Integer>>();
		
		int target=0;
		Arrays.sort(nums);
		int l=nums.length;
		//System.out.println(Ksum(nums,target));
		for(int i=0;i<nums.length;i++)
		{
			
			flag=false;	
			PrintArray(nums);
			System.out.println("\n");
			swap(nums,i ,l-1);
			int t=nums[l-1];
			System.out.println("t= "+t);
		
			PrintArray(nums);
			System.out.println("\n");
			//System.out.println("target -t "+(target-t));
			int ar[]=new int[2];
			if(i+1!=(l))
			{	
			System.out.println("inside id------");	
			ar=Sum2(nums[i+1],nums,(target-t) ,i+1);
			}
			else
			{
			 // t=nums[0];	
			 System.out.println("inside else...");
			 ar=Sum2(nums[0],nums,(target-t) ,0);}
			//&& ((l-1)!=ar[0] && (l-1)!=ar[1])
			if(flag==true  &&(t+nums[ar[0]]+nums[ar[1]]==target))
			{
			  	System.out.println("-----inside if--------");
				System.out.println("i ="+i+" value "+nums[i]);
				System.out.println("j ="+ar[0]+" value "+nums[ar[0]]);
				System.out.println("k ="+ar[1]+" value "+nums[ar[1]]);
				//System.out.println(ar[1]);
				 ArrayList<Integer> tmp=new ArrayList<Integer>();
				 tmp.add(t);
				 tmp.add(nums[ar[0]]);
				 tmp.add(nums[ar[1]]);
				 Collections.sort(tmp);
				 if(!list.contains(tmp))
				 list.add(tmp);
				 System.out.println(list);
			}
			swap(nums,l-1,i);
			PrintArray(nums);
			System.out.println("\n");
			System.out.println("-------  loop end---------------");
			
		}
		
		System.out.println("list is-----");
		
		if(list.size()==0)
		{
		  	
		}
		
		System.out.println(list);
		

	}

}
