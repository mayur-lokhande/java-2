package oop;

//Interface for SmartPhone
interface SmartPhone {
	void makeCall(String phoneNumber);

	void sendMessage(String phoneNumber, String message);

	void browseInternet();

	void useGPS();
}

//Implementation class for AndroidPhone
class AndroidPhone implements SmartPhone {
	@Override
	public void makeCall(String phoneNumber) {
		System.out.println("Making a call to " + phoneNumber + " from an Android phone.");
	}

	@Override
	public void sendMessage(String phoneNumber, String message) {
		System.out.println("Sending message '" + message + "' to " + phoneNumber + " from an Android phone.");
	}

	@Override
	public void browseInternet() {
		System.out.println("Browsing the internet on an Android phone.");
	}

	@Override
	public void useGPS() {
		System.out.println("Using GPS on an Android phone.");
	}
}

//Implementation class for IPhone
class IPhone implements SmartPhone {
	@Override
	public void makeCall(String phoneNumber) {
		System.out.println("Making a call to " + phoneNumber + " from an iPhone.");
	}

	@Override
	public void sendMessage(String phoneNumber, String message) {
		System.out.println("Sending message '" + message + "' to " + phoneNumber + " from an iPhone.");
	}

	@Override
	public void browseInternet() {
		System.out.println("Browsing the internet on an iPhone.");
	}

	@Override
	public void useGPS() {
		System.out.println("Using GPS on an iPhone.");
	}
}

//Main class for testing
public class InterfaceExample {
	public static void main(String[] args) {
		SmartPhone androidPhone = new AndroidPhone();
		androidPhone.makeCall("1234567890");
		androidPhone.sendMessage("1234567890", "Hello!");
		androidPhone.browseInternet();
		androidPhone.useGPS();

		SmartPhone iPhone = new IPhone();
		iPhone.makeCall("9876543210");
		iPhone.sendMessage("9876543210", "Hey there!");
		iPhone.browseInternet();
		iPhone.useGPS();
	}
}
