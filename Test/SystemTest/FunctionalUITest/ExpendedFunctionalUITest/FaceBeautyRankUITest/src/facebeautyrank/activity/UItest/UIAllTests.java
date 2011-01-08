package facebeautyrank.activity.UItest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class UIAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for facebeautyrank.activity.UItest");
		//$JUnit-BEGIN$
		suite.addTestSuite(HelpActivityUITest.class);
		suite.addTestSuite(PerfaceUITest.class);
		//$JUnit-END$
		return suite;
	}

}
