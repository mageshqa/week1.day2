package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {

		int num = 123,sum = 0,rem;
		
		while(num>0)
		{
			rem = num%10;
			//System.out.println(rem);
			sum=rem+sum;
			//System.out.println(sum);
			num=num/10;
			//System.out.println(num);
						
		}
		System.out.println("Final Sum of Digits is "+sum);
		
	}

}
