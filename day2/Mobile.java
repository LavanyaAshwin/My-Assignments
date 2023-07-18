package week1.day2;

public class Mobile {
	public void sendSms() {
		System.out.println("From oppo");
		
	}
	public long makeCall(long phno) {
		return phno;
	}
	
public static void main(String[] args) {
	Mobile myPhone=new Mobile();
	myPhone.sendSms();
	myPhone.makeCall(4542215451545l);
	
}
}
