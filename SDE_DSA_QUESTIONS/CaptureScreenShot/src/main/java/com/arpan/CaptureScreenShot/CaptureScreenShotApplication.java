package com.arpan.CaptureScreenShot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.util.Scanner;
		/*Complete Flow in Simple Terms
		Ask user for a webpage URL.
		Launch Chrome browser.
		Open that URL.
		Take a screenshot of the current page.
		Save it to a folder on your desktop.
		Print the saved file path.
		Close the browser and exit.*/
public class CaptureScreenShotApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your web page path to take screen shot: ");
		String path=sc.nextLine();
		WebDriver driver=new ChromeDriver(); /* When this line executes, Selenium:
												Starts a small background process called the ChromeDriver Server.
												Launches a new Chrome browser instance.
												Establishes a WebSocket or HTTP connection between your Java program and ChromeDriver.
												Selenium then communicates with Chrome through the Chrome DevTools Protocol (CDP).
												Every action (like open page, click, take screenshot) is sent as a JSON command to Chrome.
												Chrome executes it and sends a response back.*/
		try{
			driver.get(path); /*Instructs Selenium to open the given webpage (URL or local file).
								It loads the page completely (like when you type it in Chrome’s address bar).
								The driver.get() method sends a GET command via the ChromeDriver protocol.
								Chrome navigates to that address.
								Selenium waits until the document’s ready state is complete (page fully loaded).
								Then, control returns to your Java code.*/

			TakesScreenshot ts=(TakesScreenshot) driver; /*Typecasts the driver to the TakesScreenshot interface.
															Not all WebDriver implementations support screenshots, but ChromeDriver does.
															So, this cast enables access to getScreenshotAs() method.
															The ChromeDriver class actually implements multiple interfaces:
															WebDriver, JavascriptExecutor, TakesScreenshot, etc.
															By casting, you’re telling Java: “I want to use the screenshot-taking capability of this driver.”*/

			File src = ts.getScreenshotAs(OutputType.FILE); /*Captures the screenshot and stores it as a temporary file (src).
															The OutputType.FILE specifies that the screenshot should be returned as a File object.
															Selenium sends a command to Chrome through CDP:
																"Page.captureScreenshot".
															Chrome captures the current viewport as a Base64-encoded PNG image.
															Selenium receives that Base64 data.
															Converts it to a physical file in your system’s temporary directory.
															Returns a reference to that file (as src).*/

			File dest=new File("C:\\Users\\Arpan Kundu\\OneDrive\\Desktop\\ScreenShots\\screenshot_"
					+System.currentTimeMillis()+".png"); /*Defines where the screenshot should be saved permanently.
															The filename includes System.currentTimeMillis() to make it unique every time.
															System.currentTimeMillis() returns the number of milliseconds since January 1, 1970.
															So, if run multiple times, it prevents overwriting old screenshots.*/

			FileHandler.copy(src,dest);	/*Copies the screenshot file from its temporary location (src) to the destination (dest).
										The FileHandler.copy() method reads all bytes from the source file and writes them to the target file.
										Once copied, your screenshot is safely saved at the specified path.*/

			System.out.println("Screen Shot saved at: "+dest.getAbsolutePath()); /*Prints the full path where your screenshot has been saved.
																					Helpful for confirming successful execution.*/
		} catch (Exception e) {
			System.out.println("Web page not found : "+e);
		}finally {
			driver.quit(); /*Ensures that the Chrome browser closes properly, whether an error occurred or not.
							Always executes, even if an exception is thrown.
							driver.quit() sends a shutdown command to the ChromeDriver service.
							It:
								Closes all open browser windows.
								Ends the ChromeDriver background process.
								Frees up system memory and network resources.*/
		}
	}
	/*Behind the Scenes: How Screenshot Capture Works in Selenium
	When you call getScreenshotAs():
	Selenium sends a command to Chrome through the DevTools protocol.
	Chrome renders the current visible page (viewport) into an image buffer.
	The buffer is encoded as a Base64 PNG string.
	Selenium decodes that Base64 string into a .png file.
	You can then save or copy that file anywhere.
	Note: By default, this captures only the visible portion of the page (the part you see on screen).
	To capture the entire page, you’d need to scroll and stitch multiple screenshots or use Chrome’s “full-page” capture via DevTools commands.*/
}
