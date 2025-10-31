package com.arpan.FindBrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;

public class FindBrokenLinksApplication {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.eddymens.com/blog/page-with-broken-pages-for-testing-53049e870421"); //https://chatgpt.com/
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links found: " + links.size());
		List<String> hrefs = links.stream()
				.map(link -> link.getDomAttribute("href"))
				.filter(url -> url != null && !url.isEmpty() && url.startsWith("http"))
				.toList();
		driver.quit();
		HttpClient client = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(10))
				.build();
		for (String url : hrefs) {
			try {
				HttpRequest request = HttpRequest.newBuilder()
						.uri(URI.create(url))
						.method("HEAD", HttpRequest.BodyPublishers.noBody())
						.timeout(Duration.ofSeconds(10))
						.build();
				HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
				int statusCode = response.statusCode();
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
