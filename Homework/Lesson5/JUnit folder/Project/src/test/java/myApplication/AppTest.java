package myApplication;

import org.junit.*;
import org.junit.rules.Timeout;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeThat;

import java.io.IOException;

public class AppTest {
    private App app;
    private int i=0;
    
    @BeforeClass
    public static void init(){
        System.out.println("Perform before test class");

    }

    @AfterClass
    public static void finish(){
        System.out.println("Perform after test class");
    }

    @Before
    public  void createObject(){
        app = new App();
    }

    @After
    public  void clean(){
    	i++;
    }
    
    @Test
    public void testAddBook(){
        assertEquals("AddBook doesn't work", 2, app.AddBook(1));
    }
    
    @Test
    public void testCopyBook(){
        assertEquals("AddBook doesn't work", 2, app.CopyBook(1));
    }

    @Test
    public void testBuyBook(){
        assertEquals("BuyBook doesn't work", 1, app.BuyBook(10));
    }

    @Test
    public void testSellBook(){
        assertEquals("SellBook doesn't work", 18, app.SellBook(3, 15));
    }

    @Test
    public void TestRemoveBook(){
        assertEquals("Can't divide by zero", 1, app.RemoveBook(2));
    }
    
    @Test
    public void TestEatBook(){
        assertEquals("Can't divide by zero", 1, app.EatBook(2));
    }
    
    @Test
    public void TestRemoveBookZero(){
        assertEquals("Can be less than zero", 0, app.RemoveBook(0));
    }
    
    @Test
    public void TestEatBookZero(){
        assertEquals("Can be less than zero", 0, app.EatBook(0));
    }

    // Example of ignored test. So it's included to test report
    //  @Ignore("The reason")
	@Test
	public void testDemoIgnore(){
	    assertThat(1, is(1));
	}

	// Demonstration of assumption methods
	@Test
	public void testDemoAssume(){
	    assumeThat(1, is(2));
	}
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(App.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
		}
}
