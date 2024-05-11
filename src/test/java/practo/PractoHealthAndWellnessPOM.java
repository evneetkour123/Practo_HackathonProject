package practo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PractoHealthAndWellnessPOM {
	
	WebDriver driver;
	

	// Constructor
	PractoHealthAndWellnessPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// WebElement Locators + Identifications
	
	@FindBy(xpath = "//header[@id='header']//input[@id='name']")
	WebElement txt_name;
	
	@FindBy(xpath = "//header[@id='header']//input[@id='organizationName']")
	WebElement txt_OrganizationName;
	
	@FindBy(xpath = "//header[@id='header']//input[@id='contactNumber']")
	WebElement txt_ContactNumber;
	
	@FindBy(xpath = "//header[@id='header']//input[@id='officialEmailId']")
	WebElement txt_OfficialEmailId;
	
	@FindBy(xpath = "//header[@id='header']//select[@id='organizationSize']")
	WebElement txt_Select_Orsize;  
	
//	@FindBy(xpath = "//header[@id='header']//select[@id='interestedIn']")
	@FindBy(xpath = "//header[@id='header']//select[@name='interestedIn']")
	WebElement txt_Select_InterestedIn;
	
	@FindBy(xpath = "//header[@id='header']//button[@type='submit']")
	WebElement button_submit;
	
	@FindBy(xpath = "(//div[@class='text-center']/div)[1]")
	WebElement text_thankyou;
	
	@FindBy(xpath = "(//div[@class='text-center']/div)[2]")
	WebElement text_thankyou_info;
	
	//Actions
	public void name(String name) {
//		driver.navigate().refresh();
		txt_name.sendKeys(name);
		
	}
	public void Organization(String OrganizationName) {
		txt_OrganizationName.sendKeys(OrganizationName);
	}
	
	public void number(String Number) {
		txt_ContactNumber.sendKeys(Number);
	}
	public void Email(String EmailID) {
		txt_OfficialEmailId.sendKeys(EmailID);
	}
	
	public void ORSize() {
		Select drop=new Select(txt_Select_Orsize);
		drop.selectByVisibleText("<500");
		
//		drop.selectByVisibleText("Referring someone");
	}
	public void InterestedIn() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", txt_Select_Orsize);
//		txt_Select_InterestedIn.click();
		Thread.sleep(1000);
		Select drop=new Select(txt_Select_InterestedIn);
		drop.selectByVisibleText("Taking a demo");
	}
	public void clickSubmit() throws InterruptedException {
		button_submit.click();
		Thread.sleep(3000);
//		driver.navigate().to("https://www.practo.com/plus/corporate?submitted=true");
	}
	public void thankyouText() {
		System.out.println(text_thankyou.getText());
		System.out.println(text_thankyou_info.getText());
	}
}
