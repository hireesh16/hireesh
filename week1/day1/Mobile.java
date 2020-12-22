package week1.day1;

public class Mobile {
	
	public void sendSms() {
		System.out.println("Message Sent");

	}
public void makeCall() {
	System.out.println("Call Connected");

}

public static void main(String[] args) {
	Mobile phone=new Mobile();
	phone.sendSms();
	phone.makeCall();
	
}
}
