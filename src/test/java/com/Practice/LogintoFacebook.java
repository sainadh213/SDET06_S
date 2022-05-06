package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintoFacebook {
	@Test
	public void loginToFacebook() throws Throwable   {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 String titlename = driver.getTitle();
		 System.out.println(titlename);
		 Thread.sleep(2000);
		 driver.close();

	}

}
