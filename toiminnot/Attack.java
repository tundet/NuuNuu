package toiminnot;

import lejos.hardware.motor.Motor;

public class Attack {
	
	public static void saksetin() {
		
		Motor.C.rotate(140); //sakset sis��n
	}
	
	public static void saksetout() {
		
		Motor.C.rotate(-140); //sakset ulos
	}
	
	public static void hanta() {
		
		Motor.D.rotate(15); // h�nt� eteen
		Motor.D.rotate(-15); // h�nt� taakse
	}

}
