package week1.day2;

public class FibonacciSeries {
	
	

	public static void main(String[] args) {
		int range = 8;
		int secNum=1;
		int frstNum=0;
		System.out.println(frstNum);
		System.out.println(secNum);
			for (int i=2;i<range;i++) {
			int sum = frstNum + secNum;
			frstNum=secNum;
			secNum= sum;
			System.out.println(sum);
			}
	

}
}
