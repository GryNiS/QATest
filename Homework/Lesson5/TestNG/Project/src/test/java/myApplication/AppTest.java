package myApplication;

import org.testng.TestNG;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest{

	private App app = new App();
	
	@Parameters
	
	
    @Test(timeOut = 10000, groups = "testTimer")
    public void book() throws Exception {
    	app.ReadBook();
    }
    
    @BeforeMethod(enabled = true, groups = "checkTestNG")
    public void setUp() throws Exception {
        System.out.println("@BeforeMethod");
    }
 
    @AfterMethod(enabled = true, groups = "checkTestNG")
    public void tearDown() throws Exception {
        System.out.println("@AfterMethod");
    }
 
    @BeforeGroups(enabled = false, groups = "checkTestNG")
    public void beforeGroups() throws Exception {
        System.out.println("BeforeGroups");
    }
 
    @AfterGroups(enabled = false, groups = "checkTestNG")
    public void afterGroups() throws Exception {
        System.out.println("@AfterGroups");
    }
 
    @BeforeClass(enabled = true, groups = "checkTestNG")
    public void beforeClass() throws Exception {
        System.out.println("@BeforeClass");
    }
 
    @BeforeTest(enabled = false, groups = "checkTestNG")
    public void beforeTest() throws Exception {
        System.out.println("@BeforeTest");
    }
 
    @AfterTest(enabled = true, groups = "checkTestNG")
    public void afterTest() throws Exception {
        System.out.println("@AfterTest");
    }
 
    @AfterClass(enabled = false, groups = "checkTestNG")
    public void afterClass() throws Exception {
        System.out.println("@AfterClass");
    }
 
    @BeforeSuite(enabled = true, groups = "checkTestNG")
    public void beforeSuite() throws Exception {
        System.out.println("@BeforeSuite");
    }
 
    @AfterSuite(enabled = false, groups = "checkTestNG")
    public void afterSuite() throws Exception {
        System.out.println("@AfterSuite");
    }

}
