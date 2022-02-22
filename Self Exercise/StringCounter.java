package self_exercises;

public class StringCounter {

	
	public static void main(String[] args) {

		final String str = "MAGESH RAJAN";
		
		//creating an empty array with length of string
		int [] counterArray = new int[str.length()];
		
		//convert string to char array
		char string[] = str.toCharArray();
		
		//reading through string and counting frequency of each char in string
		for(int i=0;i<str.length();i++)
		{
			counterArray[i]++; //incr freq by 1 as its taking new char each time
			
			for(int j=i+1;j<str.length();j++)
			{
				if(string[i]==string[j]) //compares consecutive chars
				{
					counterArray[i]++; //if consecutive chars are same then incr freq
					string[j]=0; //make next char '0' so we dont double count next char again
				}
					
					
			}
		}
		
		//print chars with its frequency
		for(int i=0;i<counterArray.length;i++)
		{
			if(string[i]!=' ' && string[i]!='0')
			System.out.println("Character "+string[i]+" has frequency: "+counterArray[i]);
			
			
		}
	}

}
