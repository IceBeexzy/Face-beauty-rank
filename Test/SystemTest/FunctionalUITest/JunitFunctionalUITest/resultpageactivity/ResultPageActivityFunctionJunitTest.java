package facebeautyrank.activity.test.resultpageactivity;

import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import facebeautyrank.activity.ResultPageActivity;

public class ResultPageActivityFunctionJunitTest extends
		ActivityInstrumentationTestCase2<ResultPageActivity> {

	public ResultPageActivityFunctionJunitTest(String name) {
		super("facebeautyrank.activity.ResultPageActivity", ResultPageActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Smoke
	public void testBackToMenuButton()
	{
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnButton("·µ»ØÖ÷²Ëµ¥");
		solo.assertCurrentActivity("click back to meun button", "PerfaceActivity");
		try {
			solo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
