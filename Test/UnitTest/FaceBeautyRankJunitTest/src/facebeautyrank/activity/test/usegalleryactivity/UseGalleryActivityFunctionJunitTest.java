package facebeautyrank.activity.test.usegalleryactivity;

import com.jayway.android.robotium.solo.Solo;

import facebeautyrank.activity.UseGalleryActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

public class UseGalleryActivityFunctionJunitTest extends
		ActivityInstrumentationTestCase2<UseGalleryActivity> {

	public UseGalleryActivityFunctionJunitTest(String name) {
		super("facebeautyrank.activity.UseGalleryActivity", UseGalleryActivity.class);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Smoke
	public void initialMemoryTest()
	{
		Solo solo = clickDialog();
		solo.assertMemoryNotLow();
		soloFinalize(solo);				
	}
	
	@Smoke
	public void testSureButton()
	{
		Solo solo = clickDialog();
		solo.clickOnText("确定");
		solo.assertCurrentActivity("after click sure button", "DrawLineActivity");
		soloFinalize(solo);
	}
	
	@Smoke
	public void testTurnLeftButton()
	{
		Solo solo = clickDialog();
		solo.clickOnText("左转图片");
		solo.clickOnText("确定");
		solo.assertCurrentActivity("after click turn left button and sure button", "DrawLineActivity");
		soloFinalize(solo);
	}
	
	@Smoke
	public void testTurnRightButton()
	{
		Solo solo = clickDialog();
		solo.clickOnText("右转图片");
		solo.clickOnText("确定");
		solo.assertCurrentActivity("after click turn right button and sure button", "DrawLineActivity");
		soloFinalize(solo);
	}
	
	@Smoke
	public void testCombineTurnLeftandTurnRightButton()
	{
		Solo solo = clickDialog();
		solo.clickOnText("左转图片");
		solo.clickOnText("右转图片");
		solo.clickOnText("确定");
		solo.assertCurrentActivity("after click turn left and turn right button and sure button", "DrawLineActivity");
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
