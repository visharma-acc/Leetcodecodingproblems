package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class KSum {
	
	public static boolean flag=false;
	
	public static int[] Sum2 (int n , int nums[],int target , int index)
	{ 
		int ar[]=new int[2];
		
	  for(int i=0;i<nums.length-1;i++)
	  {
		  if(n+nums[i]==target && index!=i)
		  {
			  System.out.println("inside sum funtion-----");
			  System.out.println(n);
			  System.out.println(nums[i]);
			  
			//  ar[0]=n;
			 // ar[1]=nums[i];
			  ar[0]=index;
			  ar[1]=i;
			  flag=true;
			 break;
		  }
	  }
	  return ar;
	}
	
	 public static List<List<Integer>> Ksum(int[] nums, int target)
	 {
		 
		 List<List<Integer>> ar=new ArrayList<List<Integer>>();
		 int l=nums.length-1;
		 
		 for(int i=0;i<l;)
		 {
			 if(target-nums[i]==nums[l])
			 {
				 ArrayList<Integer> tmp=new ArrayList<Integer>();
				 tmp.add(nums[i]);
				 tmp.add(nums[l]);
				 ar.add(tmp);
				 i++;
				 l--;
			 }
			 else if(target>nums[i]+nums[l])
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
	 
	 public static void swap(int nums[],int i , int j)
	 {
		//int t=nums.length;
		int temp=nums[j];
		nums[j]=nums[i];
		nums[i]=temp; 
	 }
	 
	 public static void PrintArray(int nums[])
	 {
		 for(int i=0;i<nums.length;i++)
			 System.out.print(nums[i]+" ");
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {-1,-2,1,2};
		// 
		// swap 2,-1,-1,0,1,-4
		// {-1,-2,1,2}
		
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		HashSet<ArrayList<Integer>> l1=new LinkedHashSet<ArrayList<Integer>>();
		
		int target=0;
		Arrays.sort(nums);
		int l=nums.length;
		//System.out.println(Ksum(nums,target));
		for(int i=0;i<nums.length-1;i++)
		{
			System.out.println("---------loop begin ------");
			flag=false;
		
		
			
			PrintArray(nums);
			System.out.println("\n");
			swap(nums,i ,l-1);
			int t=nums[l-1];
			System.out.println("t= "+t);
		
			PrintArray(nums);
			System.out.println("\n");
			System.out.println("target -t "+(target-t));
			int ar[]=Sum2(nums[i+1],nums,(target-t) ,i+1);
			if(flag==true  && ((l-1)!=ar[0] && (l-1)!=ar[1]) && (t+nums[ar[0]]+nums[ar[1]]==target))
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
			}
			swap(nums,l-1,i);
			PrintArray(nums);
			System.out.println("\n");
			System.out.println("-------  loop end---------------");
			
		}
		
		System.out.println(list);
		
		
		

	}

}
