package week1.day2;

public class Factorial {

		int number = 10;
				
	
	public void factorial()
	{
		int result = 1;
		for(int i=1;i<=number;i++)
		{
			result=i*result;
		}
		System.out.println(result);

				
	}
	
	
		
	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		fact.factorial();
		//System.out.println("Factorial of given number "+fact.number+result);

	}

}
