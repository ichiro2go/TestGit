package jtech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataOperateTest {

	@Test
	void testStr() {
		// fail("まだ実装されていません");

		DataOperate strope = new DataOperate(); // テスト対象のクラスのインスタンス化
//		assertEquals("文字列が一致しません", "OK", strope.str("xyz"));
//		assertEquals("文字列が一致しません", "OK", strope.str("abc"));
//		assertEquals("OK", strope.str("xyz"), "文字列が一致しません");
//		assertEquals(1058, strope.tax(980), 0.5);
//		assertEquals(1058, strope.tax(980), 0.3,"誤差が許容範囲ではありません");

		// 数値の比較
//		assertSame(10, strope.num());
//		assertNotSame(20, strope.num());
		// 文字列が一致するか？
//		assertEquals("01", strope.str());
//		assertSame("01", strope.str());
//		assertSame("01", strope.str("01"));
		// 文字列が一致しないか？
//		assertNotSame("02", strope.str());
//		assertNotSame("02", strope.str("01"));

//		DataOperate aryope = new DataOperate(); // テスト対象のクラスのインスタンス化
//		int[] arraytest = { 0, 1, 2, 3, 4, 5 };
//		assertArrayEquals(arraytest, aryope.array());

		DataOperate nullope = new DataOperate(); // テスト対象のクラスのインスタンス化
//		assertNull(nullope.nullvalue());
//		assertNotNull(nullope.nullvalue());

		DataOperate tf = new DataOperate(); // テスト対象のクラスのインスタンス化
//		assertTrue(tf.trueValue());
		assertFalse(tf.falseValue());
	}

}
