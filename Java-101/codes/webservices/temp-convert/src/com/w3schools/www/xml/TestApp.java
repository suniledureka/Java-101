package com.w3schools.www.xml;

public class TestApp {

	public static void main(String[] args) throws Exception {
		TempConvertLocator locator = new TempConvertLocator(); 
		TempConvertSoap service = locator.getTempConvertSoap();
		
		String cel = "35";
		String fah = service.celsiusToFahrenheit(cel);
		
		System.out.println(cel+"C = " + fah+"F");
	}

}
