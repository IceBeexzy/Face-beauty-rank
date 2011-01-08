package facebeautyrank.performancetest.cameratest;

import com.jayway.android.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;
import facebeautyrank.activity.UseCameraActivity;

public class CameraPerformanceTest extends
		ActivityInstrumentationTestCase2<UseCameraActivity> {
	
	Solo solo;

	public CameraPerformanceTest(String name) {
		super("facebeautyrank.activity.UseCameraActivity", UseCameraActivity.class);
	}

	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
		super.setUp();
	}
	
	private String TAG = "ImageCapture";  
	//100 picture to take
	private static final int TOTAL_NUMBER_OF_IMAGECAPTURE = 100; 
	//wait 2 seconds to auto focus
	private static final long WAIT_FOR_IMAGE_CAPTURE_TO_BE_TAKEN = 2000;    

	@LargeTest   
	public void testImageCapture() { 

		try {    
			for (int i = 0; i < TOTAL_NUMBER_OF_IMAGECAPTURE; i++) {   
				Thread.sleep(WAIT_FOR_IMAGE_CAPTURE_TO_BE_TAKEN);    
				solo.clickOnImageButton(1);
				Thread.sleep(WAIT_FOR_IMAGE_CAPTURE_TO_BE_TAKEN);    
				}   
			} catch (Exception e) {   
				Log.v(TAG, e.toString());
				}    
			assertTrue("testImageCapture", true);    
	} 
	    
	protected void tearDown() throws Exception {
		try {
			solo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.tearDown();
	}


}
