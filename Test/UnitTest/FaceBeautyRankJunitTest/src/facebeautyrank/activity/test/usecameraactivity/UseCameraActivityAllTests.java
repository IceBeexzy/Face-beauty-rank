package facebeautyrank.activity.test.usecameraactivity;

import junit.framework.Test;
import junit.framework.TestSuite;

public class UseCameraActivityAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for facebeautyrank.activity.test.usecameraactivity");
		//$JUnit-BEGIN$
		suite.addTestSuite(UseCameraActivityUIJunitTest.class);
		suite.addTestSuite(UseCameraActivityFunctionJunitTest.class);
		//$JUnit-END$
		return suite;
	}

}
