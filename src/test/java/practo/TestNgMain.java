package practo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgMain{
	
	WebDriver driver;
	PractoHomePOM pH;
	PractoDoctorPOM pD;
	PractoMedicinePOM pM;
	PractoHealthAndWellnessPOM pHW;
	BaseClass bw=new BaseClass();
	
	@BeforeClass
	void setup()
	{
		driver=bw.setup();
	}
	@Test(priority=1)
	void cityAndDoctors() {
		pH=new PractoHomePOM(driver);
		pH.searchLocation();
		pH.searchDoctor();
	}
	@Test(priority = 2)
	void Stories() throws InterruptedException {
		pD=new PractoDoctorPOM(driver);
		
		pD.patientStories();
		Thread.sleep(2000);
		
		pD.experience();
		Thread.sleep(1000);
		
		pD.filters();
	}
	@Test(priority = 3)
	void getDoctorsDetails() {
		pD.getDoctorsInfo();
	}
	
	@Test(priority = 4)
	void clickMedicines() {
		pD.gotoMedicines();
	}
	@Test(priority = 5)
	void scrollwindow() throws InterruptedException {
		pM=new PractoMedicinePOM(driver);
		Thread.sleep(1000);
//		pM.scroll();
		pM.getProductInfo();
	}
	@Test(priority = 6)
	void clickHealthAndWellness() throws InterruptedException {
		pM.clickCorporate();
	}
	
	@Test(priority = 7,dataProvider="dp",dataProviderClass=BaseClass.class)
	void nameof(String Name,String OrganizationName,String Number,String EmailId) throws InterruptedException {
		pHW=new PractoHealthAndWellnessPOM(driver);
		pHW.name(Name);
		pHW.Organization(OrganizationName);
		pHW.number(Number);
		pHW.Email(EmailId);
		pHW.ORSize();
		pHW.InterestedIn();
		pHW.clickSubmit();
	}
	
	@Test(priority = 8)
	void thankyouInformation()  {
		pHW.thankyouText();
	}
	
	@AfterClass
	void end() {
		driver.close();
	}

}
