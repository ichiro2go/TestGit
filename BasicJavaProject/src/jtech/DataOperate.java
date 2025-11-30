package jtech;

public class DataOperate {
	public int num() {
		return 10;
	}

	public String str() {
//		String str1 = "01";
		String str1 = "0";
		str1 += "1";
		return str1;
	}

	public String str(String s) {
		s = "0" + s;
		return s;

//		String str1 = "abc";
//		if (str1.equals(s)) {
//			return "OK";
//		} else {
//			return "NG";
//		}
	}

	public double tax(int t) {
		return t * 1.08;
	}

	int[] ary = { 0, 1, 2, 3, 4, 5 };
	public int[] array() {
		return ary;
	}

	public String nullvalue() {
		String s = null; //または 
//		String s = "abc";//などnull以外の値
		return s;
	}

	public boolean trueValue() {
		int x = 10;
		if (x == 10) {
			return true;
		} else {
			return false;
		}
	}
	public boolean falseValue() {
		int x = 0;
		if (x == 10) {
			return true;
		} else {
			return false;
		}
	}
}
