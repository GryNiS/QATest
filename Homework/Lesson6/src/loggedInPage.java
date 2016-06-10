import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loggedInPage {

		private final FirefoxDriver driver;

		public loggedInPage(FirefoxDriver driver) {
			this.driver = driver;
		}

		public issues createIssue(String summary,String components_textarea,String versions_textarea,String description) {
			driver.findElement(By.xpath(".//*[@id='create_link']")).click();
			driver.findElement(By.id("summary")).clear();
			driver.findElement(By.id("summary")).sendKeys(summary);
			driver.findElement(By.id("components-textarea")).clear();
			driver.findElement(By.id("components-textarea")).sendKeys(components_textarea);
			driver.findElement(By.id("versions-textarea")).clear();
			driver.findElement(By.id("versions-textarea")).sendKeys(versions_textarea);
			driver.findElement(By.id("description")).clear();
			driver.findElement(By.id("description")).sendKeys(description);
			driver.findElement(By.xpath(".//*[@id='create-issue-submit']")).click();
			return new issues(driver);
		}

}
