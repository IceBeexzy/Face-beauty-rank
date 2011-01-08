package facebeautyrank.activity.test.usecameraactivity;

import com.jayway.android.robotium.solo.Solo;

import facebeautyrank.activity.R;
import facebeautyrank.activity.UseCameraActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.widget.ImageButton;

public class UseCameraActivityUIJunitTest extends
		ActivityInstrumentationTestCase2<UseCameraActivity> {
	
	private UseCameraActivity useCameraActivity;

	public UseCameraActivityUIJunitTest(String name) {
		super("facebeautyrank.activity.UseCameraActivity",UseCameraActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		useCameraActivity = getActivity();
	}
	
	@Smoke
	public void testDialog()
	{
		Solo solo = clickDialog();
		solo.assertCurrentActivity("After click Dialog", "UseCameraActivity");
	}
	
	@Smoke
	public void testShotImageButton()
	{
		clickDialog();
		ImageButton shotImageButton = (ImageButton)useCameraActivity.findViewById(R.id.SureImageButton);
		assertTrue("After Dialog", shotImageButton.isFocused());
	}
	
	@Smoke
	public void testSureImageButton()
	{
		clickDialog();
		ImageButton sureImageButton = (ImageButton)useCameraActivity.findViewById(R.id.SureImageButton);
		assertFalse("After Dialog", sureImageButton.isFocused());		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		useCameraActivity.finish();
	}
	
	private Solo clickDialog() {
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnText("È·¶¨");
		return solo;
	}
}
