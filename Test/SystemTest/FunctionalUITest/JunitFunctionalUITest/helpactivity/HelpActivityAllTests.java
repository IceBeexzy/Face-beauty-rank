package facebeautyrank.activity.test.helpactivity;

import junit.framework.Test;
import junit.framework.TestSuite;

public class HelpActivityAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for facebeautyrank.activity.test.helpactivity");
		//$JUnit-BEGIN$
		suite.addTestSuite(HelpActivityUIJunitTest.class);
		//$JUnit-END$
		return suite;
	}

}
