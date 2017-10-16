package be.pxl.lambdaexpressions.opdracht1;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberMachine {
	private ArrayList<Integer> numbers = new ArrayList<>();
	
	public NumberMachine(int[] numbers) {
		for(int i=0;i<numbers.length;i++)
			this.numbers.add(numbers[i]);
	}
	
	public String processNumbers(NumberFilter numberFilter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(numberFilter.check(numbers.get(i))) {
				if(!result.equals("")) {
					result += "-";
				}
				result += numbers.get(i);
			}
		}
		return result;
	}
	
	public String convertNumbers(Function<Integer, String> converter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if (i>0) {
				result += "-";
			}
			result += converter.apply(numbers.get(i));
		}
		return result;
	}
}
