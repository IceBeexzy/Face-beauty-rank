package facebeautyrank.activity.test.usegalleryactivity;

import com.jayway.android.robotium.solo.Solo;

import facebeautyrank.activity.R;
import facebeautyrank.activity.UseGalleryActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.widget.Button;

public class UseGalleryActivityUIJunitTest extends
		ActivityInstrumentationTestCase2<UseGalleryActivity> {
	
	private UseGalleryActivity useGalleryActivity;

	public UseGalleryActivityUIJunitTest(String name) {
		super("facebeautyrank.activity.UseGalleryActivity",UseGalleryActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		useGalleryActivity = getActivity();
	}
	
	@Smoke
	public void testDialog()
	{
		Solo solo = clickDialog();
		solo.assertCurrentActivity("After click Dialog", "UseGalleryActivity");
	}
	
	@Smoke
	public void testTurnLeftButton()
	{
		Button turnLeftButton = (Button)useGalleryActivity.findViewById(R.id.GalleryTurnLeftButton);
		assertTrue("check turn left button", turnLeftButton.isFocused());		
	}
	
	@Smoke
	public void testTurnRightButton()
	{
		Button turnRightButton = (Button)useGalleryActivity.findViewById(R.id.GalleryTurnRightButton);
		assertFalse("check turn right button", turnRightButton.isFocused());
	}
	
	@Smoke
	public void testSureButton()
	{
		Button sureButton = (Button)useGalleryActivity.findViewById(R.id.GalleryConfirmButton);
		assertFalse("check sure button", sureButton.isFocused());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		useGalleryActivity.finish();
	}
	
	private Solo clickDialog() {
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnText("È·¶¨");
		return solo;
	}

}
