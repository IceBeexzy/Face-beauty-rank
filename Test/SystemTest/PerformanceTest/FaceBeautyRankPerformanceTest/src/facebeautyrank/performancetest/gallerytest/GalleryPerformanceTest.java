package facebeautyrank.performancetest.gallerytest;

import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import facebeautyrank.activity.UseGalleryActivity;

public class GalleryPerformanceTest extends
		ActivityInstrumentationTestCase2<UseGalleryActivity> {
	
	Solo solo;

	public GalleryPerformanceTest(String name) {
		super("facebeautyrank.activity.UseGalleryActivity", UseGalleryActivity.class);
	}

	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
		super.setUp();
	}
	
	@Smoke
	public void galleryImageLoadTimePerformanceTest()
	{
		solo.clickOnButton("È·¶¨");
		solo.assertCurrentActivity("click button", "DrawLineActivity");
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
