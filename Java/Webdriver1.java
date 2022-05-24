package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Webdriver1 {

	public static void main(String[] args) throws InterruptedException{
		//ChromeDriver dr = new ChromeDriver();    //we call only chrome driver methods
          
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();    // can not connect with chrome browser
		
		dr.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//div[text()='Grocery']")).click();
		
	}

}
