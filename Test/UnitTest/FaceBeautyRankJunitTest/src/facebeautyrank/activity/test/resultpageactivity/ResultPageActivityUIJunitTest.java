package facebeautyrank.activity.test.resultpageactivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.widget.Button;
import facebeautyrank.activity.R;
import facebeautyrank.activity.ResultPageActivity;

public class ResultPageActivityUIJunitTest extends
		ActivityInstrumentationTestCase2<ResultPageActivity> {
	
	private ResultPageActivity resultPageActivity;

	public ResultPageActivityUIJunitTest(String name) {
		super("facebeautyrank.activity.ResultPageActivity", ResultPageActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		resultPageActivity = getActivity();
	}
	
	@Smoke
	public void testUploadButton()
	{
		Button upLoadButton = (Button)resultPageActivity.findViewById(R.id.UploadResultButton);
		assertTrue("result button ui check", upLoadButton.isFocused());
	}
	
	@Smoke
	public void testBackToMenuButton()
	{
		Button backToMenuButton = (Button)resultPageActivity.findViewById(R.id.BackToMenuButton);
		assertFalse("back to menu button ui check", backToMenuButton.isFocused());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		resultPageActivity.finish();
	}
}
