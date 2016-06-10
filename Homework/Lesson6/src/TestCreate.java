import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCreate{

private FirefoxDriver driver;

	@Before
	public void startBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fprojects%2FDEMO");
	}
	
	@Test
	public void test() {
		startPage home = new startPage(driver);
		loggedInPage loggedin = home.login("svv.tes@gmail.com", "1234567890");
		issues iss = loggedin.createIssue("TEST", "Wings","Pilot", "Test1234567890");
		assertTrue(iss.getSuccessfully().contains("has been successfully created."));
		enableUpdate eu = iss.findEditButtom();
		assertTrue(eu.getSuccessfully());
		findIssue fi = eu.findMyIssue();
		assertTrue(fi.getNameIssue().contains("TEST"));
	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
}
