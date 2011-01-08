package facebeautyrank.activity.test.selectactivity;

import facebeautyrank.activity.R;
import facebeautyrank.activity.SelectActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.widget.Button;

public class SelectActivityUIJunitTest extends
		ActivityInstrumentationTestCase2<SelectActivity> {
	
	private SelectActivity selectActivity;

	public SelectActivityUIJunitTest() {
		super("facebeautyrank.activity.SelectActivity", SelectActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		selectActivity = getActivity();
	}
	
	@Smoke
	public void testSelectCameraButton()
	{
		Button selectCameraButton = (Button)selectActivity.findViewById(R.id.UseCameraButton);
		assertTrue("Select Camera Button exist", selectCameraButton.isFocused());
	}
	
	@Smoke
	public void testSelectGalleryButton()
	{
		Button selectGalleryButton = (Button)selectActivity.findViewById(R.id.FromGallaryButton);
		assertFalse("Select Gallery Button exist", selectGalleryButton.isFocused());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
