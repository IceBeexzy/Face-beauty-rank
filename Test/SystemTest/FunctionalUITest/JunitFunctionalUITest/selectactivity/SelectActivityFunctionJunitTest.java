package facebeautyrank.activity.test.selectactivity;

import com.jayway.android.robotium.solo.Solo;

import facebeautyrank.activity.SelectActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

public class SelectActivityFunctionJunitTest extends
		ActivityInstrumentationTestCase2<SelectActivity> {

	public SelectActivityFunctionJunitTest() {
		super("facebeautyrank.activity.SelectActivity", SelectActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Smoke
	public void testClickFromCameraButton()
	{
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnButton("使用相机拍摄");
		solo.assertCurrentActivity("Click FromCamera Button.", "UseCameraActivity");
	}
	
	@Smoke
	public void testClickFromGalleryButton()
	{
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnButton("本地图片读取");
		solo.assertCurrentActivity("Click FromGallery Button.", "UseGalleryActivity");
	}	

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
