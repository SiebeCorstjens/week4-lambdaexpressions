package be.pxl.lambdaexpressions.opdracht1;

import java.util.function.Function;

public class NumberSelector {
	private NumberMachine numberMachine;
	
	public NumberSelector(NumberMachine machine) {
		this.numberMachine = machine;
	}
	
	public String showEvenNumbers() {
		String result = numberMachine.processNumbers(new NumberFilter() {
			@Override
			public boolean check(int number) {
				return(number%2==0);
			}
		});
		return result;
	}
	
	public String showNumbersAbove(int number) {
		return numberMachine.processNumbers(n -> n > number);
	}
	
	public String printHexNumbers() {
		numberMachine.convertNumbers(new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return Integer.toHexString(t);
			}
		});
		
		return numberMachine.convertNumbers(t -> Integer.toHexString(t));
	}
	
	
}
