package facebeautyrank.activity.UItest;

import com.jayway.android.robotium.solo.Solo;
import android.content.pm.ActivityInfo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import facebeautyrank.activity.PerfaceActivity;

public class PerfaceUITest extends
		ActivityInstrumentationTestCase2<PerfaceActivity> {
	
	Solo solo;

	public PerfaceUITest(String name) {
		super("facebeautyrank.activity.PerfaceActivity", PerfaceActivity.class);
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
		
		boolean actual1 = solo.searchButton("开始体验");
		assertTrue("portrait to landscape", actual1);
		
		boolean actual2 = solo.searchButton("帮助");
		assertTrue("portraite to landscape", actual2);
		
		boolean actual3 = solo.searchButton("退出");
		assertTrue("portraite to landscape", actual3);		
	}
	
	@Smoke
	public void landscapeToPortraite()
	{
		solo.setActivityOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		solo.setActivityOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		boolean actual1 = solo.searchButton("开始体验");
		assertTrue("portrait to landscape", actual1);
		
		boolean actual2 = solo.searchButton("帮助");
		assertTrue("portraite to landscape", actual2);
		
		boolean actual3 = solo.searchButton("退出");
		assertTrue("landscape to portraite", actual3);		
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
