package com.iConnectTest.stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Context {

	public static WebDriver Driver;
	static boolean Sdriver=false;

	@Before
	public void Setup() {
		if(Driver==null)
		{
		System.out.println("Driver intializing");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Irresistable\\iConnectTest\\src\\main\\resources\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		//sSdriver=true;
		System.out.println("Driver initialized");
		}
	}

	public WebDriver getDriver() {
		System.out.println("Driver returned" + Driver);
		return Driver;
	}

	@After
	public void tearDownDriver() {
		Driver.quit();
		System.out.println("Driver Terminated");
		Driver=null;

	}

}
