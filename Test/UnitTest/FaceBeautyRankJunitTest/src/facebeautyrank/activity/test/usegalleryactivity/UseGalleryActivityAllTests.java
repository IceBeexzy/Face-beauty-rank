package facebeautyrank.activity.test.usegalleryactivity;

import junit.framework.Test;
import junit.framework.TestSuite;

public class UseGalleryActivityAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for facebeautyrank.activity.test.usegalleryactivity");
		//$JUnit-BEGIN$
		suite.addTestSuite(UseGalleryActivityUIJunitTest.class);
		suite.addTestSuite(UseGalleryActivityFunctionJunitTest.class);
		//$JUnit-END$
		return suite;
	}

}
