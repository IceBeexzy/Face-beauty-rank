package facebeautyrank.activity.UItest;

import com.jayway.android.robotium.solo.Solo;

import android.content.pm.ActivityInfo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import facebeautyrank.activity.HelpActivity;

public class HelpActivityUITest extends
		ActivityInstrumentationTestCase2<HelpActivity> {
	
	Solo solo;

	public HelpActivityUITest(String name) {
		super("facebeautyrank.activity.HelpActivity", HelpActivity.class);
	}

	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
		super.setUp();
	}
	
	@Smoke
	public void portraitToLandscapeTest()
	{
		solo.setActivityOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		solo.setActivityOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		
		boolean actual = solo.searchText("CopyRight");
		assertTrue("portraite to landscape", actual);				
	}
	
	@Smoke
	public void landscapeToPortraite()
	{
		solo.setActivityOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		solo.setActivityOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		boolean actual = solo.searchText("CopyRight");
		assertTrue("landscape to portraite", actual);		
	}

	protected void tearDown() throws Exception {
		try {
			solo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.tearDown();
	}

}
