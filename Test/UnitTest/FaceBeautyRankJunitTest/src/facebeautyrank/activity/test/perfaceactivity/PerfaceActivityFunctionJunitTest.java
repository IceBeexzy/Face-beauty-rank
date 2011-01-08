package facebeautyrank.activity.test.perfaceactivity;
import com.jayway.android.robotium.solo.Solo;
import facebeautyrank.activity.PerfaceActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

public class PerfaceActivityFunctionJunitTest extends
	ActivityInstrumentationTestCase2<PerfaceActivity> {

	public PerfaceActivityFunctionJunitTest() {
		super("facebeautyrank.activity.PerfaceActivity",PerfaceActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();		
	}
	
	@Smoke
	public void testClickEnjoyButton()
	{
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnButton("开始体验");
		solo.assertCurrentActivity("Click Enjoy Button", "SelectActivity");
		try {
			solo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Smoke
	public void testClickHelpButton()
	{
		Solo solo = new Solo(getInstrumentation(), getActivity());
		solo.clickOnButton("帮助");
		solo.assertCurrentActivity("Click Help Button", "HelpActivity");
		try {
			solo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		getActivity().finish();
		super.tearDown();
	}
}