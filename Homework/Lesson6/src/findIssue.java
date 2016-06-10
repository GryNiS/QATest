import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findIssue {
	
	private final FirefoxDriver driver;

	public findIssue(FirefoxDriver driver) {
		this.driver = driver;
	}

	
	public String getNameIssue() {
		return driver.findElement(By.xpath(".//*[@id='summary-val']")).getText();
	}
	
}
