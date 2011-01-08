package facebeautyrank.activity.test.drawlineactivity;

import facebeautyrank.activity.DrawLineActivity;
import facebeautyrank.activity.R;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.widget.Button;

public class DrawLineActivityUIJunitTest extends
		ActivityInstrumentationTestCase2<DrawLineActivity> {
	
	private DrawLineActivity drawLineActivity;

	public DrawLineActivityUIJunitTest(String name) {
		super("facebeautyrank.activity.DrawLineActivity", DrawLineActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		drawLineActivity = getActivity();
	}
	
	@Smoke
	public void testNextDrawLineButton()
	{
		Button nextDrawLineButton = (Button)drawLineActivity.findViewById(R.id.NextStepButton);
		assertTrue("new draw line button ui check", nextDrawLineButton.isFocused());
	}
	
	@Smoke
	public void testToResultButton()
	{
		Button toResultButton = (Button)drawLineActivity.findViewById(R.id.CountAndConfirm);
		assertFalse("confirm button ui check", toResultButton.isFocused());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		drawLineActivity.finish();
	}

}
