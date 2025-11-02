package com.arpan.FindBrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class FindBrokenLinksApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a web page link to find broken links: ");
		String path=sc.nextLine();
		WebDriver driver = new ChromeDriver(); /*Creates a new Chrome browser instance using Selenium WebDriver.
												Starts the ChromeDriver service, which runs as a local background server.
												The Java code sends commands (in JSON format) over HTTP to this driver.
												ChromeDriver then communicates with the actual Chrome browser using the Chrome DevTools Protocol (CDP).
												The result (page load, element info, etc.) is returned back to Selenium as a structured response.*/
		driver.manage().window().maximize(); /*Maximizes the browser window to full screen.
											Selenium sends a "setWindowRect" command to ChromeDriver with the desired dimensions equal to your screen size.*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); /*Sets an implicit wait of 10 seconds.
																			When Selenium searches for an element, it will retry for up to 10 seconds before throwing NoSuchElementException.
																			The timeout is stored inside the WebDriver session configuration.
																			Each subsequent findElement() or findElements() call checks for the element repeatedly until either:
																			The element is found, or
																			The wait time expires.*/
		driver.get(path); /*Opens the given web page in the Chrome browser.
							Selenium sends a GET command through ChromeDriver to navigate to this URL.
							Chrome loads the page fully (HTML, CSS, JS, etc.).
							Selenium waits for the document’s ready state to be "complete" before moving on.*/
		List<WebElement> links = driver.findElements(By.tagName("a")); /*Finds all <a> elements (anchor tags) on the page and stores them in a list.
																		Selenium queries Chrome’s DOM tree using the command:
																		"findElements" with selector type = "tag name" and value = "a".
																		Chrome returns a list of node references (each representing an anchor tag).
																		Selenium wraps these in WebElement objects so you can interact with them in Java.*/
		System.out.println("Total links found: " + links.size());
		List<String> hrefs = links.stream()
				.map(link -> link.getDomAttribute("href"))
				.filter(url -> url != null && !url.isEmpty() && url.startsWith("http"))
				.toList(); /*Extracts only valid URLs from each anchor tag.
							Here’s what happens step-by-step:
							links.stream() — turns the list of WebElements into a stream for functional-style processing.
							.map(link -> link.getDomAttribute("href")) — for each <a> element, get the value of its href attribute.
							Example: for <a href="https://example.com">, it returns "https://example.com".
							.filter(...) — removes any null, empty, or non-HTTP URLs (like mailto: or #).
							.toList() — collects the remaining valid URLs into a new list of strings.
							getDomAttribute("href") asks ChromeDriver to read the href attribute directly from the DOM, even if the attribute was added or modified by JavaScript.*/
		driver.quit(); /*Closes all browser windows and terminates the ChromeDriver session.
						Sends a "quit" command to the ChromeDriver server.
						ChromeDriver shuts down all open browser instances, deletes the WebDriver session, and frees resources.*/
		HttpClient client = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(10))
				.build(); /*Creates an HTTP client (from Java’s built-in java.net.http package).
							Sets a 10-second timeout for each connection attempt.
							The HttpClient uses non-blocking NIO (New I/O) under the hood.
							It manages TCP socket connections to remote web servers.
							It’s thread-safe and efficient for making many small HTTP calls.*/
		for (String url : hrefs) {
			try {
				HttpRequest request = HttpRequest.newBuilder()
						.uri(URI.create(url))
						.method("HEAD", HttpRequest.BodyPublishers.noBody())
						.timeout(Duration.ofSeconds(10))
						.build(); /*Builds an HTTP request for each link.
									Uses the HTTP HEAD method instead of GET.
									A HEAD request asks the server for just the headers (no response body).
									This is faster and uses less bandwidth, but still returns the status code (like 200, 404, etc.).
									Perfect for checking if a link is alive or broken.
									The builder sets up a new HTTP request.
									URI.create(url) parses the string into a proper URI object.
									The method and timeout are attached.
									The request object is finalized with .build() — immutable and ready to send.*/
				HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding()); /*Sends the HTTP request and waits for the response.
																											BodyHandlers.discarding() means you don’t need the response body — only the headers (status code).
																											client.send() opens a TCP connection to the host.
																											Sends the HEAD request over the network.
																											Waits for the response.
																											The HTTP server returns headers like HTTP/1.1 200 OK or 404 Not Found.
																											Java parses that response and wraps it into an HttpResponse object.*/
				int statusCode = response.statusCode(); /*Extracts the HTTP status code from the response.*/
				if (statusCode >= 400 && statusCode != 403)
					System.out.println("BROKEN LINK: " + url + " (Code: " + statusCode + ")");
				else if (statusCode == 403)
					System.out.println("LINK BLOCKED (Forbidden): " + url);
				else
					System.out.println("VALID LINK: " + url + " (Code: " + statusCode + ")");
			} catch (Exception e) {
				System.out.println("Exception for URL: " + url + " -> " + e.getMessage());
			}
		}
	}
}
