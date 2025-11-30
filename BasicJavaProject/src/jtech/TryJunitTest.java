package jtech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TryJunitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAllです!");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAllです!");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEachです!");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEachです!");
	}

	@Test
	void testTryJunit() {
		System.out.println("Test1です!");

		assertEquals(1, TryJunit.cnt);
		//fail("まだ実装されていません");
	}

	@Test
	void testMain() {
		System.out.println("Test2です!");

		String[] str = { "main", "メソッド" };
		TryJunit.main(str);
		TryJunit tj = new TryJunit();
		assertEquals(4, tj.sub());
		//fail("まだ実装されていません");
	}

}
