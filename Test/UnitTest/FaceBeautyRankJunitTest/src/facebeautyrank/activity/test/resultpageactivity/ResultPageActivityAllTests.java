package facebeautyrank.activity.test.resultpageactivity;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ResultPageActivityAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for facebeautyrank.activity.test.resultpageactivity");
		//$JUnit-BEGIN$
		suite.addTestSuite(ResultPageActivityFunctionJunitTest.class);
		suite.addTestSuite(ResultPageActivityUIJunitTest.class);
		//$JUnit-END$
		return suite;
	}

}
