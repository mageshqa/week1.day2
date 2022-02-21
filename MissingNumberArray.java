package week1.day2;

import java.util.Arrays;

public class MissingNumberArray {

	public static void main(String[] args) {

		int [] array = {1,2,4,3,6,8,7};
		int temp;
		
		Arrays.sort(array);
		
		
		for(int i=0;i<array.length;i++)
		{
			temp = i+1;
			if(array[i]!=temp)
				{
				System.out.println("missing number is "+temp);
				break;
				}
					}
	}

}
