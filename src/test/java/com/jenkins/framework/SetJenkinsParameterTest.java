package com.jenkins.framework;

import org.testng.annotations.Test;

public class SetJenkinsParameterTest {
	@Test
public void recieveParameterFromJenkins() {
	String BROWSER=System.getProperty("browser");
	System.out.println(BROWSER);
}
}
