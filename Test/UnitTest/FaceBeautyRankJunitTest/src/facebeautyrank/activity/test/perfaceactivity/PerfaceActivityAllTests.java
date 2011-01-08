package facebeautyrank.activity.test.perfaceactivity;

import junit.framework.Test;
import junit.framework.TestSuite;

public class PerfaceActivityAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for facebeautyrank.activity.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(PerfaceActivityUIJunitTest.class);
		suite.addTestSuite(PerfaceActivityFunctionJunitTest.class);
		//$JUnit-END$
		return suite;
	}

}
