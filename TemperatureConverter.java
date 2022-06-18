public class TemperatureConverter{
	
    /**
    * The function, fahrenheitToCelsius converts the value of a given temperature in degree
    * Fahrenheit to degree Celsius.
    *
    * @param tempFahrenheit of datatype double - temperature value in 
    * degree Fahrenheit.
    *
    * @return temperature value in degree Celsius, a double
    */
	public static double fahrenheitToCelsius(double tempFahrenheit){
		
		double tempCelsius;
		
		tempCelsius = (tempFahrenheit - 32) * 5.0/9;
		
		return tempCelsius;
		
	}
    
    /**
    * The function, printTemperature displays the value of a given temperature in degree
    * Fahrenheit and its equivalent in degree Celsius.
    *
    * @param tempFahrenheit of datatype double - temperature value in 
    * degree Fahrenheit.
    *
    */	
	public static void printTemperature(double tempFahrenheit){
		
		double tempCelsius;
		
		tempCelsius = fahrenheitToCelsius(tempFahrenheit);
		
		System.out.println("F: " + tempFahrenheit + "\nC: " + tempCelsius);
		
	}

	public static void main(String[] args){
	
	    printTemperature(32.0);
	
	}

}