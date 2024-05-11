package practo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PractoHomePOM {
	WebDriver driver;
	
	//Constructor
	PractoHomePOM(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//WebElement Locators + Identifications
	
	@FindBy(xpath="//input[@placeholder='Search location']")
	WebElement txt_SearchLocation_loc;
	
	@FindBy(xpath="//div[contains(text(),'Bangalore')]")
	WebElement dropdown_City_loc;
	
	@FindBy(xpath="//input[@placeholder='Search doctors, clinics, hospitals, etc.']")
	WebElement txt_Search_loc;
	
	@FindBy(xpath="//div[normalize-space()='Doctor']")
	WebElement dropdown_Doctor_loc;
	
	//Action Methods
	public void searchLocation() {
		txt_SearchLocation_loc.clear();
		txt_SearchLocation_loc.sendKeys("Bangal");
		dropdown_City_loc.click();
	}
	
	//For Bangalore city, identify Hospitals that is Open 24/7, has Parking facility with rating more than 3.5; Display the hospital names
	//here we are using Doctors because by selecting hospital.filters are not available.
	public void searchDoctor() {
		txt_Search_loc.clear();
		txt_Search_loc.sendKeys("Doctor");
		dropdown_Doctor_loc.click();
	}

}
