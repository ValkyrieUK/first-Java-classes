/**
 * @author valkyrieuk
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		String make = "Lamborghini";
		String model = "Aventador Roadster";
		double engineSize = 6.5;
		byte gear = 3;
		short speed = (byte) (gear * 20);
		System.out
				.printf("The %s %s has a %.1f liter engine and is in gear %02X. It is travelling at %dMPH",
						make, model, engineSize, gear, speed);
	}

}
