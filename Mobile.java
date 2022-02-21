package week1.day2;

public class Mobile {
	
	public void makeCall() {
		System.out.println("make call");
			}
	
	public void sendmsg() {
		System.out.println("send msg");
	}

	private void print(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Mobile mobileObject = new Mobile();
		mobileObject.makeCall();
		mobileObject.sendmsg();
		mobileObject.print(2, 2);
			
	}

}
