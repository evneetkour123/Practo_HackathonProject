package practo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

public class BaseClass {

	public static WebDriver driver;

	public WebDriver setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
	public String takeScreenshot(String screenshotName) throws IOException, InterruptedException {
		Thread.sleep(3000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File s = ts.getScreenshotAs(OutputType.FILE);
	    String trgFilePath = "C:\\Users\\2317554\\Downloads\\practo 1\\practo\\ScreenShot\\" + screenshotName + ".png";
	    File trg=new File(trgFilePath);
	    		
	    FileHandler.copy(s, trg);
	    return trgFilePath;
	}
	
	@DataProvider(name="dp")
	String[][]dumy(){
		String [][]data= {{"Evneet","GP Homes","9660780819","evneetkour8847@gmail.com"}};
		return data;
	}

}
