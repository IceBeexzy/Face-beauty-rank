package facebeautyrank.activity.test.selectactivity;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SelectActivityAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for facebeautyrank.activity.test.selectactivity");
		//$JUnit-BEGIN$
		suite.addTestSuite(SelectActivityUIJunitTest.class);
		suite.addTestSuite(SelectActivityFunctionJunitTest.class);
		//$JUnit-END$
		return suite;
	}

}
