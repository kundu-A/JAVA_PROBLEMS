package com.arpan.CaptureScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.util.Scanner;

public class CaptureScreenShotApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your web page path to take screen shot: ");
		String path=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		try{
			driver.get(path);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Arpan Kundu\\OneDrive\\Desktop\\ScreenShots\\screenshot_"+System.currentTimeMillis()+".png");
			FileHandler.copy(src,dest);
			System.out.println("Screen Shot saved at: "+dest.getAbsolutePath());
		} catch (Exception e) {
			System.out.println("Web page not found : "+e);
		}finally {
			driver.quit();
		}
	}

}
