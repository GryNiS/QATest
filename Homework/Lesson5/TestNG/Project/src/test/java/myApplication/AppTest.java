package myApplication;

import org.testng.TestNG;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest{

	private App app = new App();
	
    @Test
    public void book() throws Exception {
    	app.ReadBook();
    }
    
    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("@BeforeMethod");
    }
 
    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("@AfterMethod");
    }
 
    @BeforeGroups
    public void beforeGroups() throws Exception {
        System.out.println("BeforeGroups");
    }
 
    @AfterGroups
    public void afterGroups() throws Exception {
        System.out.println("@AfterGroups");
    }
 
    @BeforeClass
    public void beforeClass() throws Exception {
        System.out.println("@BeforeClass");
    }
 
    @BeforeTest
    public void beforeTest() throws Exception {
        System.out.println("@BeforeTest");
    }
 
    @AfterTest
    public void afterTest() throws Exception {
        System.out.println("@AfterTest");
    }
 
    @AfterClass
    public void afterClass() throws Exception {
        System.out.println("@AfterClass");
    }
 
    @BeforeSuite
    public void beforeSuite() throws Exception {
        System.out.println("@BeforeSuite");
    }
 
    @AfterSuite
    public void afterSuite() throws Exception {
        System.out.println("@AfterSuite");
    }

}
