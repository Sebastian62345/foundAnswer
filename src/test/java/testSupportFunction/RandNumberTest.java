package testSupportFunction;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandNumberTest {


	@Test
	public void testGetRandedNumber() {
		RandNumber oGetRnTest = new RandNumber();
		int actVal  = oGetRnTest.getRandedNumber();
		assertTrue(1 <= actVal && actVal <= 100);
	}

}