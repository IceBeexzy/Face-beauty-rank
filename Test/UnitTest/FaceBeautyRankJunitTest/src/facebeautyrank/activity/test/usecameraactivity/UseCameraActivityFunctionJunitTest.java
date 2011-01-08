package facebeautyrank.activity.test.usecameraactivity;

import com.jayway.android.robotium.solo.Solo;

import facebeautyrank.activity.R;
import facebeautyrank.activity.UseCameraActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

public class UseCameraActivityFunctionJunitTest extends
		ActivityInstrumentationTestCase2<UseCameraActivity> {

	public UseCameraActivityFunctionJunitTest(String name) {
		super("facebeautyrank.activity.UseCameraActivity", UseCameraActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Smoke
	public void testClickSureButtonWithoutTakePicture()
	{
		Solo solo = clickDialog();
		solo.clickOnImageButton(R.id.SureImageButton);
		boolean actual = solo.searchText("请先照相");
		assertTrue("Click Sure Button without take picture first", actual);	
		soloFinalize(solo);
	}
	
	@Smoke
	public void testClickSureButtonAfterTakePicture()
	{
		Solo solo = clickDialog();
		solo.clickOnImageButton(R.id.TakePhotoImageButton);
		solo.clickOnImageButton(R.id.SureImageButton);
		solo.assertCurrentActivity("Click SureButton after take picture", "DrawLineActivity");
		soloFinalize(solo);		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	private Solo clickDialog() {
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnText("确定");
		return solo;
	}
	
	private void soloFinalize(Solo solo) {
		try {
			solo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
