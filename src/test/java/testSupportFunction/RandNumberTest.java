package testSupportFunction;

import static org.junit.Assert.*;

import org.junit.Test;

import support.RandNumber;

public class RandNumberTest {


	@Test
	public void testGetRandedNumber() {
		RandNumber oGetRnTest = new RandNumber();
		int actVal  = oGetRnTest.getRandedVal();
		assertTrue(1 <= actVal && actVal <= 100);
	}

}
