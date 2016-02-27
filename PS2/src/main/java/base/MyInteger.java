package base;

public class MyInteger {
	private int iValue;

	public MyInteger() {
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public boolean isEven() {
		if ((this.iValue % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if ((this.iValue % 2) == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isPrime() {
		if (this.iValue < 2) {
			return false;
		} 
		for (int y = 2; y < this.iValue; y = y + 1) {
				if (this.iValue % y == 0)
					return false;
			}
		return true;
	}

	public static boolean isEven(int x) {
		if ((x % 2) == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isOdd(int x) {
		if ((x % 2) == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isPrime(int x) {
		if (x < 2) {
			return false;
		} 
		for (int y = 2; y < x; y = y + 1) {
				if (x % y == 0)
					return false;
			}
		return true;
	}

	public static boolean isEven(MyInteger z) {
		if ((z.getiValue() % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger z) {
		if ((z.getiValue() % 2) == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isPrime(MyInteger z) {
		if (z.getiValue() < 2) {
			return false;
		} 
		for (int y = 2; y < z.getiValue(); y = y + 1) {
				if (z.getiValue() % y == 0)
					return false;
			}
		return true;
	}

	public boolean isEqual(int x) {
		if (x == getiValue()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEqual(MyInteger z) {
		if (getiValue() == z.getiValue()) {
			return true;
		} else {
			return false;
		}
	}
}
