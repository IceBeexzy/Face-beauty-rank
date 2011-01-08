import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import facebeautyrank.count.Analyse;
import junit.framework.TestCase;


public class CountJunitTest extends TestCase {
	private Analyse analyse;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		analyse = new Analyse();
		
	}
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testCalculate() {
		analyse.Anaylse(0.618, 0.333333, 0.42, 0.618, 1.6);
		analyse.calculateForTest();
		assertEquals("TestCalculate",0, analyse.getAnalyticResult());		
	}

}
