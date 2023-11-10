package com.ts;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.agastya.base.TestBase;

@Test
public class SearchComponant extends TestBase {

	@Test
	public void varifySearchResults() {

		// RemoteWebDriver driver= BaseClass.openBroser();
		// driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"))
				.sendKeys("Men Sneakers", Keys.RETURN);
		List<WebElement> productList = driver
				.findElements(By.xpath("//div[@class=\"product-productMetaInfo\"]/h4[@class=\"product-product\"]"));
		Iterator<WebElement> itr = productList.iterator();
		while (itr.hasNext()) {
			String productTitle = itr.next().getText();
			System.out.println("Checking: " + productTitle);
			Assert.assertTrue(itr.next().getText().contains("Sneakera"));
		}
	}

	public void verifyWhenWomenFilterIsAppliedToSearchResult() {
		System.out.println("Sec Test Case");

	}

	@Test
	public void m2() {
		System.out.println("Third Test Case");
	}
}
