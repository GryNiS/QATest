import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enableUpdate {
	
	private final FirefoxDriver driver;

	public enableUpdate(FirefoxDriver driver) {
		this.driver = driver;
	}

	public Boolean getSuccessfully() {
		if(driver.findElements(By.xpath(".//*[@id='edit-issue']")).size()>0){
			driver.findElement(By.xpath(".//*[@id='edit-issue']")).click();
			driver.findElement(By.id("summary")).clear();
			driver.findElement(By.id("summary")).sendKeys("TEST2");
			driver.findElement(By.xpath(".//*[@id='edit-issue-submit']")).click();
			if (driver.findElement(By.xpath(".//*[@id='aui-flag-container']/div/div")).getText().contains("has been updated")){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

	public findIssue findMyIssue() {
		driver.findElement(By.xpath(".//*[@id='find_link']")).click();
		driver.findElement(By.xpath(".//*[@id='issues_new_search_link_lnk']")).click();
		driver.findElement(By.xpath(".//*[@id='navigator-sidebar']/div[1]/div/div[1]/div/div/ul/li[2]/a")).click();
		return new findIssue(driver);
	}
}
