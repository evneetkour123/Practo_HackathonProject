package practo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PractoDoctorPOM {

	WebDriver driver;

	// Constructor

	PractoDoctorPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement Locators + Identifications
	@FindBy(xpath = "//div[@data-qa-id='doctor_review_count_section']")
	WebElement dropdown_PatientStories;

	@FindBy(xpath = "(//div[@data-qa-id='doctor_review_count_section']//li)[1]")
	WebElement select_PatientStories;

	@FindBy(xpath = "//div[@data-qa-id='years_of_experience_section']")
	WebElement dropdown_Experience;

	@FindBy(xpath = "(//div[@data-qa-id='years_of_experience_section']//li)[3]")
	WebElement select_Experience;

	@FindBy(xpath = "//i[@data-qa-id='all_filters_icon']")
	WebElement select_Filters;

	@FindBy(xpath = "//label[@for='Fees2']//div[@data-qa-id='Fees_radio']")
	WebElement select_Fees;

	@FindBy(xpath = "//label[@for='Availability3']//div[@data-qa-id='Availability_radio']")
	WebElement select_Availability;


	@FindBy(xpath = "//div[@class='info-section']")
	List<WebElement> txt_Doctorsinfo;
	
	@FindBy(xpath = "//div[text()='Medicines']")
	WebElement click_Medicines;
	

	// Action method
	public void patientStories() {
		dropdown_PatientStories.click();
		select_PatientStories.click();
	}

	public void experience() {
		dropdown_Experience.click();
		select_Experience.click();
	}

	public void filters() throws InterruptedException {
		select_Filters.click();

		select_Fees.click();
		Thread.sleep(1000);

		select_Filters.click();

		select_Availability.click();
		Thread.sleep(1000);
	}

	public void getDoctorsInfo() {
		for (int i = 0; i < 5; i++) {
			System.out.println(txt_Doctorsinfo.get(i).getText());
			}
		}
	public void gotoMedicines() {
		click_Medicines.click();
	}
}
