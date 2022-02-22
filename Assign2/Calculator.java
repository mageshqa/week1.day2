package week1.day2;

public class Calculator {
	int sum, diff,reminder;
	float product;
	double quotient;
	public int addNumber(int a, int b, int c)
	{
		sum = a+b+c;
		return sum;
		
	}
	
	public int subNumber(int a, int b)
	{
		diff = a-b;
		return diff;
	}
	
	public float mulNumber(float a, float b)
	{
		product = a*b;
		return product;
	}
	
	public double divNumber(double a, double b)
	{
		quotient = a/b;
		return quotient;
	}
	
	public int reminder(int a, int b)
	{
		reminder = a%b;
		return reminder;
	}

}
