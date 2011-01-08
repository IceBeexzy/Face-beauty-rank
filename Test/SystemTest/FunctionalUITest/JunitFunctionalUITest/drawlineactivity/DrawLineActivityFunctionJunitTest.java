package facebeautyrank.activity.test.drawlineactivity;

import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import facebeautyrank.activity.DrawLineActivity;

public class DrawLineActivityFunctionJunitTest extends
		ActivityInstrumentationTestCase2<DrawLineActivity> {

	public DrawLineActivityFunctionJunitTest(String name) {
		super("facebeautyrank.activity.DrawLineActivity", DrawLineActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Smoke
	public void testInitialTextView()
	{
		Solo solo = new Solo(getInstrumentation(), getActivity());
		boolean actual = solo.searchText("1/7");
		assertTrue("initial text view", actual);
		try {
			solo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Smoke
	public void testDrawNextLineButton()
	{
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnScreen(10.0f, 20.0f);
		solo.clickOnButton("下一步");
		boolean actual = solo.searchText("2/7");
		assertTrue("after draw one line", actual);
		try {
			solo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Smoke
	public void testResultButton()
	{
		Solo solo = new Solo(getInstrumentation(), getActivity());
		for(int i = 0; i<7; i++)
		{
			solo.clickOnScreen(10.0f, 20.0f);
			solo.clickOnButton("下一步");
		}
		solo.clickOnButton("查询结果");
		solo.assertCurrentActivity("click to result button", "ResultPageActivity");
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
