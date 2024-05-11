package practo;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PractoMedicinePOM {
	WebDriver driver;

	// Constructor
	PractoMedicinePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement Locators + Identifications
	@FindBy(xpath = "//div[@class='popular-product']")
	WebElement section_ProductDetails;

	@FindBy(xpath = "//div[contains(@class,'m-product-wrapper')]")
	List<WebElement> section_Products;
	
	@FindBy(xpath = "//span[@class='nav-interact']")
	WebElement button_dropdown_corporate;
	
	@FindBy(xpath = "//a[text()='Health & Wellness Plans']")
	WebElement dropdown_HandW;
	
	
	// Action Methods

	public void getProductInfo() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", section_ProductDetails);
		Thread.sleep(1000);
		System.out.println("------------------Popular Products---------------");
		for (WebElement ele : section_Products) {
			System.out.println(ele.getText());
		}
	}
	public void clickCorporate() throws InterruptedException {
		button_dropdown_corporate.click();
		Thread.sleep(1000);
		dropdown_HandW.click();
	}

}
