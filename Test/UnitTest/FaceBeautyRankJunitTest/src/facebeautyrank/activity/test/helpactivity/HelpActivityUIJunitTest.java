/**
 * 
 */
package facebeautyrank.activity.test.helpactivity;

import facebeautyrank.activity.HelpActivity;
import facebeautyrank.activity.R;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;
import android.widget.TextView;

/**
 * @author Ice
 *
 */
public class HelpActivityUIJunitTest extends
		ActivityInstrumentationTestCase2<HelpActivity> {
	
	private HelpActivity helpActivity;


	public HelpActivityUIJunitTest() {
		super("facebeautyrank.activity.HelpActivity",HelpActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		helpActivity = getActivity();
	}
	
	@Smoke
	public void testTextView()
	{
		TextView tv = (TextView)helpActivity.findViewById(R.id.HelpTextView);
		String excepted = "CopyRight By Chiubun & XuZhiyang";
		assertEquals(excepted, tv.getText().toString());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
