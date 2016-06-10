import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class issues {
	private FirefoxDriver driver;
	
	public issues(FirefoxDriver driver) {
	this.driver = driver;
	}
	
	public String getSuccessfully() {
		return driver.findElement(By.xpath(".//*[@id='aui-flag-container']/div/div")).getText();
	}
	
	public enableUpdate findEditButtom() {
		driver.get("https://jira.atlassian.com/projects/DEMO/issues/DEMO-13844?filter=reportedbyme");
		return new enableUpdate(driver);
	}

}
