package simplecalculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedWithWeiredAddTest {
	private int expected;
	private int val1;
	private int val2;

	@Parameters
	public static Collection getParameters(){
		return Arrays.asList(new Object[][]{
			{5,7,100},
			{5,100,105},
			{100,7,107}
		});
	}

	public ParameterizedWithWeiredAddTest(int v1, int v2, int e){
		val1 = v1;
		val2 = v2;
		expected = e;
	}
	
	@Test
	public void WeiredAddWithParameters(){
		Simplecalculator calc = new Simplecalculator();
		calc.weiredAdd(val1, val2);
		assertEquals(expected,calc.getResult());
	}
}
