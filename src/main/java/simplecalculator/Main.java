package simplecalculator;

public class Main {

	public static void main(String[] args) {

		Simplecalculator calc = new Simplecalculator();
			calc.add(10, 20);
			System.out.println(calc.getResult());

			Simplecalculator calc1 = new Simplecalculator();
			calc1.sub(10, 20);
			System.out.println(calc1.getResult());
			
			Simplecalculator calc2 = new Simplecalculator();
			calc2.inc(10);
			System.out.println(calc2.getResult());
			
	}

}
