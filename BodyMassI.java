import java.util.Scanner;
public class BodyMassI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KilogramsPerPound = 0.45359237;
		final double MetersPerInch = 0.0254;
		
		double weightInKG = weight * KilogramsPerPound;
		double heightInM = height * MetersPerInch;
		double bmi = weightInKG / (heightInM * heightInM);
		
		System.out.println("BMI is " + bmi);
		
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if( bmi < 25.0)
			System.out.println("Normal");
		else if(bmi < 30.0)
			System.out.println("Overweight");
		else if(bmi >= 30.0)
			System.out.println("Obese");
				
	}	
}
