package facebeautyrank.activity.test.drawlineactivity;

import junit.framework.Test;
import junit.framework.TestSuite;

public class DrawLineActivityAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for facebeautyrank.activity.test.drawlineactivity");
		//$JUnit-BEGIN$
		suite.addTestSuite(DrawLineActivityUIJunitTest.class);
		suite.addTestSuite(DrawLineActivityFunctionJunitTest.class);
		//$JUnit-END$
		return suite;
	}

}
