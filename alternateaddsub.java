package assignment;

import java.util.*;

public class alternateaddsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=n;
		for(int i=0;i<n;i++)
		{
			arr[i]=count;
			count--;
			
		}
		
		int opt=sc.nextInt();
		int val1=0,val2=0;
		int result=0;
		if(opt==1)
		{
			for(int i=0;i<arr.length;i=i+2)
			{
				val1 +=arr[i];
			}
			
			for(int i=1;i<arr.length;i=i+2)
			{
				val2 +=arr[i];
			}
			result=val1-val2;
			
			
		}
		if(opt==2)
		{
			for(int i=2;i<arr.length;i=i+2)
			{
				val1 +=arr[i];
			}
			val2=arr[0];
			for(int i=1;i<arr.length;i=i+2)
			{
				val2 +=arr[i];
			}
			result=val2-val1;
		}
		
		System.out.println(result);
      
	}

}
