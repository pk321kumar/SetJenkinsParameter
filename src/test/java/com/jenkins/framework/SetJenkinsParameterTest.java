package com.jenkins.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetJenkinsParameterTest {
	@Test
public void recieveParameterFromJenkins() {
	String BROWSER=System.getProperty("browser");
	System.out.println(BROWSER);
	if(BROWSER.equals("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	}
	
}
}
