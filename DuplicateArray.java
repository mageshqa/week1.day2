package week1.day2;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//int count = 0;
		
		Arrays.sort(arr);
		
		for(int i =0;i<arr.length-1;i++)
		{
			int count =0;
			for(int j=1;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					//System.out.println("Duplicate Number is "+arr[i]);
				}
			}
			
			  if(count>1) 
				  System.out.println("Duplicate Number is "+arr[i]);
			 
				
		}
		
		
	}

}
