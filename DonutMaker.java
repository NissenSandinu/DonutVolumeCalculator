/*
 * Author : Nissen Sandinu Wettasinghe 
 * Modified Date : June 03, 2024
 * Description: This is the Donut volume calculator, worker method with get and set functions.
 */
import java.util.Scanner;
public class DonutMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Donut donut;
		double outerRadius;
		double innerRadius;
		double volume; 
		
		System.out.println("Donut Volume Calculator");
		
		System.out.print("Enter Outer Radius in cm :");
		outerRadius = input.nextDouble();// User input.
		System.out.print("Enter Inner Radius in cm :");
		innerRadius = input.nextDouble();// User input.
		
		/* Donut object with user input and 
		 * exports the values to the worker method Donut.java.
		*/
		donut = new Donut(innerRadius, outerRadius);
		// import of the volume value from Donut.java worker method.
		volume = donut.calculateVolume();
		
		/*printf with %.2f%n round up the volume to 2 decimal places and space a line 
		donut.calculateVolume imports the calculated volume from Donut.java class
		*/
		System.out.printf("The Volume of the dount in cm^3 : %.2f%n", + volume);
		System.out.println("Program by Nissen Wettasinghe");
		
		// Closing input 
		input.close();

	}

}
