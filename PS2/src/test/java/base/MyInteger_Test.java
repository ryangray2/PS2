package base;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		MyInteger integer = new MyInteger();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		MyInteger a = new MyInteger();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isEven1test() {
		boolean result = MyInteger.isEven(2);
		assertEquals(true, result);
	}

	@Test
	public void isEven2test() {
		boolean result = MyInteger.isEven(3);
		assertEquals(false, result);
	}

	@Test
	public void isOdd1test() {
		boolean result = MyInteger.isOdd(2);
		assertEquals(false, result);
	}

	@Test
	public void isOdd2test() {
		boolean result = MyInteger.isOdd(3);
		assertEquals(true, result);
	}

	@Test
	public void isPrime1test() {
		boolean result = MyInteger.isPrime(13);
		assertEquals(true, result);
	}

	@Test
	public void isPrime2test() {
		boolean result = MyInteger.isPrime(4);
		assertEquals(false, result);
	}

	@Test
	public void isEven3test() {
		MyInteger one = new MyInteger(1);
		boolean result = MyInteger.isEven(one);
		assertEquals(false, result);
	}

	@Test
	public void isEven4test() {
		MyInteger two = new MyInteger(2);
		boolean result = MyInteger.isEven(two);
		assertEquals(true, result);
	}

	@Test
	public void isOdd3test() {
		MyInteger two = new MyInteger(2);
		boolean result = MyInteger.isOdd(two);
		assertEquals(false, result);
	}

	@Test
	public void isOdd4test() {
		MyInteger three = new MyInteger(3);
		boolean result = MyInteger.isOdd(three);
		assertEquals(true, result);
	}

	@Test
	public void isPrime3test() {
		MyInteger fourteen = new MyInteger(14);
		boolean result = MyInteger.isPrime(fourteen);
		assertEquals(false, result);
	}

	@Test
	public void isPrime4test() {
		MyInteger thirteen = new MyInteger(13);
		boolean result = MyInteger.isPrime(thirteen);
		assertEquals(true, result);
	}

	@Test
	public void isEven5test() {
		MyInteger four = new MyInteger(4);
		boolean result = four.isEven();
		assertEquals(true, result);
	}

	@Test
	public void isEven6test() {
		MyInteger five = new MyInteger(5);
		boolean result = five.isEven();
		assertEquals(false, result);
	}

	@Test
	public void isOdd5test() {
		MyInteger four = new MyInteger(4);
		boolean result = four.isOdd();
		assertEquals(false, result);
	}

	@Test
	public void isOdd6test() {
		MyInteger five = new MyInteger(5);
		boolean result = five.isOdd();
		assertEquals(true, result);
	}

	@Test
	public void isPrime5test() {
		MyInteger four = new MyInteger(4);
		boolean result = four.isPrime();
		assertEquals(false, result);
	}

	@Test
	public void isPrime6test() {
		MyInteger seven = new MyInteger(7);
		boolean result = seven.isPrime();
		assertEquals(true, result);
	}

	@Test
	public void isEqual1test() {
		MyInteger six = new MyInteger(6);
		boolean result = six.isEqual(6);
		assertEquals(true, result);
	}

	@Test
	public void isEqual2test() {
		MyInteger six = new MyInteger(6);
		boolean result = six.isEqual(7);
		assertEquals(false, result);
	}

	@Test
	public void isEquals3test() {
		MyInteger six = new MyInteger(6);
		MyInteger six2 = new MyInteger(6);
		boolean result = six.isEqual(six2);
		assertEquals(true, result);
	}

	@Test
	public void isEquals4test() {
		MyInteger six = new MyInteger(6);
		MyInteger seven = new MyInteger(7);
		boolean result = six.isEqual(seven);
		assertEquals(false, result);
	}
}
