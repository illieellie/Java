package interfacePrc2;

public class PrcInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] objs = {
				new HandPhone(), 
				new Camera(), 
				new Phone(),
				new DigitalCamera(), 
				new Usb()};
		
		
		// 충전 가능한 객체들 충전 
		for(Object obj : objs) {
			if(obj instanceof Chargeable c) {
				c.Charge();
			
			}
			else System.out.println("충전가능한 객체가 아닙니다.");
		}
		
	}

}


