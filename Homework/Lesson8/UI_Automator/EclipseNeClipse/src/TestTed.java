import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class TestTed extends UiAutomatorTestCase {

	public void test() throws UiObjectNotFoundException {
		getUiDevice().pressHome();
		UiObject TED = new UiObject(new UiSelector().text("TED"));
		TED.clickAndWaitForNewWindow();
		UiObject finds = new UiObject(new UiSelector().resourceId("com.ted.android:id/searchButton"));
		finds.clickAndWaitForNewWindow();
		UiObject findsname = new UiObject(new UiSelector().resourceId("com.ted.android:id/search_field").index(0));
		findsname.setText("Mayassa");
		UiObject findssind = new UiObject(new UiSelector().resourceId("com.ted.android:id/row").index(1));
		assertTrue("Unable to detect find",findssind.exists());
		findssind.clickAndWaitForNewWindow();
		UiObject findssin = new UiObject(new UiSelector().resourceId("com.ted.android:id/talkListItemRow"));
		findssin.clickAndWaitForNewWindow();
		UiObject add = new UiObject(new UiSelector().resourceId("com.ted.android:id/detailActionAddToQueue"));
		add.click();
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		UiObject userui = new UiObject(new UiSelector().className("android.support.v7.app.ActionBar$Tab").index(4));
		userui.click();
		UiObject ochered = new UiObject(new UiSelector().resourceId("com.ted.android:id/myTalksQueueRow"));
		ochered.clickAndWaitForNewWindow();
		UiObject item = new UiObject(new UiSelector().resourceId("com.ted.android:id/talkListItemRow").index(0));
		assertTrue("Unable to detect item",item.exists());
	}
	
}
