package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		final double fator = 5.0 / 9.0;
		double fahrenheit = 86.0;
		double celcius = (fahrenheit -32) * fator;
		
		System.out.println("A temperatura de " + fahrenheit + "°F em °C é de : " + celcius + "°C");
				
	}
}
