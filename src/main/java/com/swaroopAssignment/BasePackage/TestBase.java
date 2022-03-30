package com.swaroopAssignment.BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver wd;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(
					"C:\\Users\\swaro\\eclipse-workspace\\Parabank\\src\\main\\java\\com\\swaroopAssignment\\Config\\configuration.properties");
			prop.load(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			wd = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			wd = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			wd = new ChromeDriver();
			break;
		default:
			System.out.println("Please use a valid browser name");
			break;

		}
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wd.get(prop.getProperty("URL"));
	}

	public void tearDown() {
		wd.quit();
	}

}
