package facebeautyrank.test.alltest;

import facebeautyrank.activity.test.drawlineactivity.DrawLineActivityAllTests;
import facebeautyrank.activity.test.helpactivity.HelpActivityAllTests;
import facebeautyrank.activity.test.perfaceactivity.PerfaceActivityAllTests;
import facebeautyrank.activity.test.resultpageactivity.ResultPageActivityAllTests;
import facebeautyrank.activity.test.selectactivity.SelectActivityAllTests;
import facebeautyrank.activity.test.usecameraactivity.UseCameraActivityAllTests;
import facebeautyrank.activity.test.usegalleryactivity.UseGalleryActivityAllTests;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for facebeautyrank.activity.test.alltest");
		//$JUnit-BEGIN$
		suite.addTest(PerfaceActivityAllTests.suite());
		suite.addTest(HelpActivityAllTests.suite());
		suite.addTest(SelectActivityAllTests.suite());
		suite.addTest(DrawLineActivityAllTests.suite());
		suite.addTest(UseCameraActivityAllTests.suite());
		suite.addTest(UseGalleryActivityAllTests.suite());
		suite.addTest(ResultPageActivityAllTests.suite());
		//$JUnit-END$
		return suite;
	}
}
