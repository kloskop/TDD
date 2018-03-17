import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(8, calculator.sum(4, 4));
	}

	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.substract(4, 4));
	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		assertEquals(16, calculator.multiply(4, 4));
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertEquals(2.5, calculator.divide(10, 4), 0.111);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testThatDividngByZeroThrowsIAE() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.divide(8, 0), 0.00001);
	}

}
