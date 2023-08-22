package letshopethisgoesasplanned;

/*	This is only where the ADT is going
 * to be made.
 * This is not the main program
 * */
public class WeatherData {

	//Which ADT's to include in the program
	private double temperature;
	private double humidity;
	private double windSpeed;
	private String conditions;

	//what the method with the ADT's gonna be known as
	public WeatherData(double temperature, double humidiity, double windspeed, String conditions) {
	//implementation of the ADT's into the method;	
		this.temperature=temperature;
		this.conditions=conditions;
		this.humidity=humidity;
		this.windSpeed=windspeed;
	}
	
	//get and set method's to use in the main program
	// have to write "double ___" to reference to the ADT's in the program
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public void setHumidity (double humidity) {
		this.humidity=humidity;
	}
	
	public double gethumidity () {
		return humidity;
	}
	
	public void setWindSpeed(double windSpeed) {
		this.windSpeed=windSpeed;
	}
	
	public double getwindSpeed() {
		return windSpeed;
	}
	
	
	public void setConditions(String conditions) {
		this.conditions=conditions;
	}
	
	public String getConditions() {
		return conditions;
	}
}

