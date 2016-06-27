package kdk.android.simplydo.test;

import org.junit.Test;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import junit.framework.TestCase;
import kdk.android.simplydo.SimplyDoActivity;

public class TestZah extends ActivityInstrumentationTestCase2<SimplyDoActivity> {
	private Solo solo;

	public TestZah() {
		super(SimplyDoActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		if (!solo.searchText("GrandMA")){
			solo.clearEditText(0);
			solo.enterText(0, "GrandMA");
			solo.clickOnButton(0);
		}
		solo.clickOnText("GrandMA");
		solo.waitForText("New Item Name");
		if (!solo.searchText("one")){
			solo.clearEditText(0);
			solo.enterText(0, "one");
			solo.clickOnButton(0);
		}
		solo.goBack();
	}

	@Test
	public void testList() throws Exception{
		solo.clearEditText(0);
		solo.enterText(0, "Test");
		solo.clickOnButton(0);
		assertTrue("List Test not found", solo.searchText("Test"));
		solo.clickLongOnText("Test");
		solo.waitForText("List Options");
		solo.clickOnText("Delete");
		solo.waitForText("Delete?");
		solo.clickOnText("Yes");
		assertTrue("List Test found", !solo.searchText("Test"));
	}
	
	@Test
	public void testEditList(){
		
		solo.clickLongOnText("GrandMA");
		solo.waitForText("List Options");
		solo.clickOnText("Edit");
		solo.waitForText("Edit List Label");
		solo.clearEditText(0);
		solo.enterText(0, "GrandPA");
		solo.clickOnText("OK");
		assertTrue("List GrandPA not found", solo.searchText("GrandPA"));
		solo.clickLongOnText("GrandPA");
		solo.waitForText("List Options");
		solo.clickOnText("Edit");
		solo.waitForText("Edit List Label");
		solo.clearEditText(0);
		solo.enterText(0, "GrandMA");
		solo.clickOnText("OK");
	}
	
	@Test
	public void testAddItem(){
		solo.clickOnText("GrandMA");
		solo.waitForText("New Item Name");
		solo.clearEditText(0);
		solo.enterText(0, "TestItem");
		solo.clickOnButton(0);
		assertTrue("Item TestItem not found", solo.searchText("TestItem"));
		solo.clickLongOnText("TestItem");
		solo.waitForText("Item Options");
		solo.clickOnText("Delete");
		solo.waitForText("Delete?");
		solo.clickOnText("Yes");
		assertTrue("Item TestItem found", !solo.searchText("TestItem"));
	}
	
	@Test
	public void testChekedItem(){
		solo.clickOnText("GrandMA");
		solo.waitForText("New Item Name");
		solo.clickOnText("one");
		assertTrue("Item not checked", solo.getText("one").getCurrentTextColor() == -10066330);
		solo.clickOnText("one");
		assertTrue("Item checked", solo.getText("one").getCurrentTextColor() == -1);
	}
	
	@Test
	public void testStarItem(){
		solo.clickOnText("GrandMA");
		solo.waitForText("New Item Name");
		solo.clickLongOnText("one");
		solo.waitForText("Item Options");
		solo.clickOnText("Add Star");
		solo.clickLongOnText("one");
		solo.waitForText("Item Options");
		solo.clickOnText("Remove Star");
		solo.clickLongOnText("one");
		solo.waitForText("Add Star");
	}
	
	@Test
	public void testInactive(){
		solo.clickOnText("GrandMA");
		solo.waitForText("New Item Name");
		solo.clearEditText(0);
		solo.enterText(0, "TestItem");
		solo.clickOnButton(0);
		solo.clickOnText("TestItem");
		solo.clickOnImageButton(0);
		solo.waitForText("Delete All Inactive");
		solo.clickOnText("Delete All Inactive");
		solo.waitForText("Delete Inactive?");
		solo.clickOnText("Yes");
		assertTrue("Item TestItem found", !solo.searchText("TestItem"));
	}
	
	
	@Test
	public void testSort(){
		solo.clickOnText("GrandMA");
		solo.waitForText("New Item Name");
		solo.clearEditText(0);
		solo.enterText(0, "sad");
		solo.clickOnButton(0);
		solo.clearEditText(0);
		solo.enterText(0, "zad");
		solo.clickOnButton(0);
		solo.clearEditText(0);
		solo.enterText(0, "aad");
		solo.clickOnButton(0);
		solo.clickOnImageButton(0);
		solo.waitForText("Sort Now");
		solo.takeScreenshot();
		solo.clickOnText("Sort Now");
		solo.takeScreenshot();
		solo.clickOnText("sad");
		solo.clickOnText("zad");
		solo.clickOnText("aad");
		solo.clickOnImageButton(0);
		solo.waitForText("Delete All Inactive");
		solo.clickOnText("Delete All Inactive");
		solo.waitForText("Delete Inactive?");
		solo.clickOnText("Yes");
	}
	
	@Test
	public void testSetings(){
		solo.clickOnImageButton(0);
		solo.waitForText("Settings");
		solo.clickOnText("Settings");
		solo.waitForActivity("SettingsActivity");
		if (!solo.isCheckBoxChecked(0))
			solo.clickOnText("Confirm Delete All Inactive");
		solo.goBack();
		solo.clickOnText("GrandMA");
		solo.waitForText("New Item Name");
		solo.clearEditText(0);
		solo.enterText(0, "sad");
		solo.clickOnButton(0);
		solo.clearEditText(0);
		solo.enterText(0, "zad");
		solo.clickOnButton(0);
		solo.clearEditText(0);
		solo.enterText(0, "aad");
		solo.clickOnButton(0);
		solo.clickOnText("sad");
		solo.clickOnText("zad");
		solo.clickOnText("aad");
		solo.clickOnImageButton(0);
		solo.waitForText("Delete All Inactive");
		solo.clickOnText("Delete All Inactive");
		assertTrue("Confirm Delete All Inactive dont work", solo.waitForText("Delete Inactive?"));
		solo.clickOnText("Yes");
		solo.clickOnImageButton(0);
		solo.waitForText("Settings");
		solo.clickOnText("Settings");
		solo.waitForActivity("SettingsActivity");
		if (solo.isCheckBoxChecked(0))
			solo.clickOnText("Confirm Delete All Inactive");
		solo.goBack();
		solo.clearEditText(0);
		solo.enterText(0, "sad");
		solo.clickOnButton(0);
		solo.clearEditText(0);
		solo.enterText(0, "zad");
		solo.clickOnButton(0);
		solo.clearEditText(0);
		solo.enterText(0, "aad");
		solo.clickOnButton(0);
		solo.clickOnText("sad");
		solo.clickOnText("zad");
		solo.clickOnText("aad");
		solo.clickOnImageButton(0);
		solo.waitForText("Delete All Inactive");
		solo.clickOnText("Delete All Inactive");
		assertTrue("Confirm Delete All Inactive setting dont work", !solo.waitForText("Delete Inactive?"));
	}
	
	@Override
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

}
