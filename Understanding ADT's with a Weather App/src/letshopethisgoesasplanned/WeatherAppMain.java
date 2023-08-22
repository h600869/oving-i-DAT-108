package letshopethisgoesasplanned;

//This is the main App that will use
//the ADT's that we created in WeatherData.java
public class WeatherAppMain {

	public static void main(String[] args) {

		//Create a new WeatherData Object
		WeatherData currentWeather = new WeatherData(25.96, 15.87, 12.62, "Horrible");
		
		
		//Display current weather information
		System.out.println("Temperature: " + currentWeather.getTemperature());
        System.out.println("Humidity: " + currentWeather.gethumidity());
        System.out.println("Wind Speed: " + currentWeather.getwindSpeed());
        System.out.println("Conditions: "+ currentWeather.getConditions());
        
        
        // Update temperature and conditions using setter methods
        currentWeather.setTemperature(29.46);
        currentWeather.setConditions("Hans har kommet til Bergen");
        
        
        //	Display updated information
        System.out.println("Updated Temper: " + currentWeather.getTemperature());
        System.out.println("Update Conditions: "+ currentWeather.getConditions());
	}

}
