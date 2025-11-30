package jtech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountTest {

	@Test
	void testSexCheck() {
//		fail("まだ実装されていません");
		Discount sc = new Discount();
		assertEquals(0.2, sc.sexCheck("f"), 0.0);
		assertEquals(0.1, sc.sexCheck("m"), 0.0);
	}
	
	@Test
//	@Disabled
	public void testPriceCheck() {
		Discount pc = new Discount();
		assertTrue(pc.priceCheck(50000));
		assertFalse(pc.priceCheck(10000));
	}
	
	@Test
	public void testAgeCheck() {
		// fail("まだ実装されていません");
		Discount ac = new Discount();
		assertEquals(3000, ac.ageCheck(18));
		assertEquals(0, ac.ageCheck(20));
	}

}
