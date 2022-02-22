package week1.day2;

public class PrimeNumber {

	
	public static void main(String[] args) {

		int a = 13;
		if(a<0)
		System.out.println("Number "+a+" is not Prime Number");
				
		else
		{
			//for(int i=2; i<a;i++)
			{
				if(a%2==0)
					System.out.println("Number "+a+" is not Prime Number");
				
				System.out.println("Number "+a+" is Prime Number");		
	
			}
		
		}
	}
	
}
