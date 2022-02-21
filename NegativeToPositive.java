package week1.day2;

public class NegativeToPositive {

	private int number = -40, absolute;
	
	
	public static void main(String[] args) {

		//create object of class
		NegativeToPositive neg = new NegativeToPositive();
		
		//check if given number is negative
		
		if(neg.number<1)
		{
			neg.absolute = Math.abs(neg.number);
			System.out.println("The number "+neg.number+" is converted to "+neg.absolute);
		}
			
		
	}

}
