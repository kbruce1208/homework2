package simplecalculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class simplecalculatorTest {
	
	@Test
	@Category(Rain.class)//db 기존의 레코드들을 테스트 하는곳.
	public void addWithPositives() {
		Simplecalculator calc = new Simplecalculator();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}
	
	@Test
	@Category(Rain.class)
		public void addWithzero() {
			Simplecalculator calc = new Simplecalculator();
			calc.add(0,0);
			assertEquals(0, calc.getResult());

	}
	
	@Test
	public void addWithPositiveArgsWithPositives() {
		Simplecalculator calc = new Simplecalculator();
		calc.addWithPositiveArgs(10, 20);
		assertEquals(30, calc.getResult());
}
	
	@Test(expected=InvalidArgumentException.class) // ()가 assert부분을 담당.
	public void addWithPositiveArgsWithNegative() {
		Simplecalculator calc = new Simplecalculator();
		calc.addWithPositiveArgs(-10, 20);
}

	@Test
	public void subwithPositives() {
		Simplecalculator calc = new Simplecalculator();
		calc.sub(10, 30);
		assertEquals(-20, calc.getResult());

}
	
	@Test
	public void subWithzero() {                              
		Simplecalculator calc = new Simplecalculator();      // Arrange = fixture
		calc.sub(0,0);                                       // Act --예상결과가 실행결과와 맞는지 확인하는것
		assertEquals(0, calc.getResult());                   // Assert = oracle

}
	@Test
	public void incWithzero() {
		Simplecalculator calc = new Simplecalculator();
		calc.inc(0);
		assertEquals(0, calc.getResult());

}
	@Test
	public void decWithzero() {
		Simplecalculator calc = new Simplecalculator();
		calc.dec(0);
		assertEquals(0, calc.getResult());

}
	@Test
	public void incWithpositives() {
		Simplecalculator calc = new Simplecalculator();
		calc.inc(10);
		assertEquals(10, calc.getResult());

}
	@Test
	public void divWithpositives() {
		Simplecalculator calc = new Simplecalculator();
		calc.div(20, 2);
		assertEquals(10, calc.getResult());

}
	@Test
	public void decWithpositive() {
		Simplecalculator calc = new Simplecalculator();
		calc.dec(10);
		assertEquals(-10, calc.getResult());

}
	
	
	
//	@Test
//	public void divWithZero() {
//		Simplecalculator calc = new Simplecalculator();
//		calc.div(10, 0);
//	//	assertEquals(10, calc.getResult());
//
//}
	
}
