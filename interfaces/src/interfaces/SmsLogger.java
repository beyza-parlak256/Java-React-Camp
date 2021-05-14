package interfaces;

public class SmsLogger implements Logger{ // Logger ý SmsLogger a uyarla 

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi : " + message);
		
	} 
	
	
}
