package com.arpan.CountWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountWebElementsApplication {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		try{
			List<WebElement> links = driver.findElements(By.tagName("a"));
			List<WebElement> images = driver.findElements(By.tagName("img"));
			List<WebElement> inputs = driver.findElements(By.tagName("input"));
			List<WebElement> allElements = driver.findElements(By.xpath("//*"));

			System.out.println("Total links: " + links.size());
			System.out.println("Total images: " + images.size());
			System.out.println("Total input fields: " + inputs.size());
			System.out.println("Total elements on page: " + allElements.size());
		}catch (Exception e){
			System.out.println("Link not found : "+e);
		}finally {
			driver.quit();
		}
	}

}
