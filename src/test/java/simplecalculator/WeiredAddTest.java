package simplecalculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class WeiredAddTest {

	@Test
	@Category(Rain.class)
	public void weiredAddWithFiveAndSeven() {
		Simplecalculator calc = new Simplecalculator();
		calc.weiredAdd(5,7);
		assertEquals(100,calc.getResult());
	}
	
	@Test
	public void weiredAddWithFiveAndNotSeven() {
		Simplecalculator calc = new Simplecalculator();
		calc.weiredAdd(5,100);
		assertEquals(105,calc.getResult());
	}
	
	@Test
	public void weiredAddWithNotFiveAndSeven() {
		Simplecalculator calc = new Simplecalculator();
		calc.weiredAdd(100,7);
		assertEquals(107,calc.getResult());
	}

}
