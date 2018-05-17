package com.jobs.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JenkinsJobs 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("===Hello Jenkins===\n");
		
		System.setProperty("webdriver.gecko.driver", "F:\\PERSONAL\\VIDEO TUTORIALS\\Testing\\Selenium\\Selenium Essentials\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		
		WebDriver k = new FirefoxDriver();
		
		k.get("https://www.facebook.com");
		
		System.out.println("===="+k.getTitle());
		
		Thread.sleep(5000);
		
		k.close();
	}

}
