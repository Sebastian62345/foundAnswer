package testSupportFunction;

import static org.junit.Assert.*;

import org.junit.Test;
import support.RandLetter;

public class RandLetterTest {
	
	@Test
	public void testGetRandLetter() {
		RandLetter oGetRlTest = new RandLetter();
		char actVal  = oGetRlTest.getRandedVal();
		assertTrue(actVal >= 'A' && actVal <= 'Z');
	}

}
