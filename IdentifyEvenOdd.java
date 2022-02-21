package week1.day2;

public class IdentifyEvenOdd {

	//private int num;
	
	
	  public void numEvenOdd(int num) 
	  { 
		  for(int i=1; i<=num; i++)
		  {
			  int evenodd = i%2;
			  
			  if(evenodd==0) {
				  System.out.println("Given Number "+i+" is even number"); }
				  
			  else { System.out.println("Given Number "+i+" is odd number");
			  }
				 
			  
		  }
	  }
	  
		  
		  public void numOdd(int n) 
		  { 
			  for(int i=1; i<=n; i++)
			  {
				  int evenodd = i%2;
				  
				  if(evenodd==1) 
				  {
					  System.out.println("Given Number "+i+" is odd number");
				  }
			  }
			  
				  
				 // else { System.out.println("Given Number "+i+" is odd number"); }
					 
				  
			  }
			  
			  public void numEven(int nu) 
			  { 
				  for(int i=1; i<=nu; i++)
				  {
					  int evenodd = i%2;
					  
					  if(evenodd==0) {
						  System.out.println("Given Number "+i+" is even number"); }
						  
					 // else { System.out.println("Given Number "+i+" is odd number"); }
						 
					  
				  }
			  }
			  
		  


		 
	
	
	public static void main(String[] args) {

		IdentifyEvenOdd obj = new IdentifyEvenOdd();
		obj.numEvenOdd(100);
		obj.numEven(100);
		obj.numOdd(100);
		
		
		/*
		 * if(obj.num%2==0) {
		 * System.out.println("Given Number "+obj.num+" is even number"); }
		 * 
		 * else { System.out.println("Given Number "+obj.num+" is odd number"); }
		 */
		 
		
		 
			
	}

}
