package interfaces;

public class SmsLogger implements Logger{ // Logger � SmsLogger a uyarla 

	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi : " + message);
		
	} 
	
	
}
