package facebeautyrank.activity.test.perfaceactivity;

import facebeautyrank.activity.PerfaceActivity;
import facebeautyrank.activity.R;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.widget.Button;

public class PerfaceActivityUIJunitTest extends
		ActivityInstrumentationTestCase2<PerfaceActivity> {
	
	private PerfaceActivity perfaceActivity;

	public PerfaceActivityUIJunitTest() {
		super("facebeautyrank.activity.PerfaceActivity",PerfaceActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();		
		perfaceActivity = getActivity();
	}	
	
	@Smoke
	public void testEnjoyButton()
	{
		Button enjoyButton = (Button)perfaceActivity.findViewById(R.id.EnterButton);
		assertTrue("button focus", enjoyButton.isFocused());		
	}	
	
	@Smoke
	public void testQuitButton()
	{
		Button quiteButton = (Button)perfaceActivity.findViewById(R.id.QuitButton);		
		assertFalse("not focus", quiteButton.isFocused());
	}
	
	@Smoke
	public void testHelpButton()
	{
		Button helpButton = (Button)perfaceActivity.findViewById(R.id.HelpButton);
		assertFalse("not focus", helpButton.isFocused());
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		perfaceActivity.finish();
		super.tearDown();
	}
}
