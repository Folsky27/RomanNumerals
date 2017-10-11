import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals roman = new RomanNumerals();

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void test_I_is_1() {
		int result = roman.convertToInteger("I");
			
		assertEquals (1, result);
	}
	
	@Test
	public void test_II_is_2() {
		int result = roman.convertToInteger("II");
			
		assertEquals (2, result);
	}
	
	@Test
	public void testRepetion3TimesInRow() {
					
		assertFalse ("Result", RomanNumerals.testRepetion3TimesInRow("VIIII"));
	}

}
