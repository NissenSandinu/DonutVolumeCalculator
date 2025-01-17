/*
 * Author : Nissen Sandinu Wettasinghe 
 * Modified Date : June 03, 2024
 * Description: This is the Donut volume calculator, worker method with get and set functions.
 */
public class Donut {

	private double innerRadius; 
	private double outerRadius;
	
	//Default Constructor
	public Donut() {
		this(0,0);
	}
	// Overloaded Constructor for get and set of inner and Outer Radiuses
	public Donut(double innerRadius, double outerRadius) {
		this.innerRadius = innerRadius;
		this.outerRadius = outerRadius;
	}
	// get and set functions for innerRadius
	public double getinnerRadius() { // get method return a value 
		return innerRadius;
	}
	public void setinnerRadius(double innerRadius) { // void is use for set method, is not returning a value.
		this.innerRadius = innerRadius;
	}
	// get and set functions for outerRadius
	public double getouterRadius() { // get method return a value 
		return outerRadius;
	}
	public void setouterRadius(double outerRadius) { // void is use for set method, is not returning a value.
		this.outerRadius = outerRadius;
	}
	/* Calculate equation for the volume of the donut.
	 * 𝑉𝑜𝑙𝑢𝑚𝑒 = 0.25 * π² * (𝑅𝑜 - 𝑅𝑖)² * (𝑅𝑜 + 𝑅𝑖) 
	*/
	public double calculateVolume() {
		return 0.25*Math.pow(Math.PI,2)// Math.pow is get power of value by 2
				*Math.pow((this.outerRadius - this.innerRadius),2)
				*(this.outerRadius + this.innerRadius);
				
	}

}
