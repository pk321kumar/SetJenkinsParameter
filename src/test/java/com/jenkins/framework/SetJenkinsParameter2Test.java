package com.jenkins.framework;

import org.testng.annotations.Test;

public class SetJenkinsParameter2Test {
	@Test
public void recieveParameterFromJenkins() {
	String BROWSER=System.getProperty("browser");
	String ENV=System.getProperty("url");
	System.out.println("Browser===>"+BROWSER+" ,Url==>"+ENV);
	//..
}
}
