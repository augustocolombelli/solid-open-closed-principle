package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import example.one.NumberOrganizerOne;
import example.one.enums.FilterOption;
import example.one.enums.OrderOption;
import example.two.NumberOrganizerTwo;
import example.two.filter.OnlyEvenImpl;
import example.two.order.AscendingImpl;

public class RunExamples {

	public static void main(String[] args) {
		List<Integer> numbers = returnRandomList();
		
		runExampleOne(numbers);
		runExampleTwo(numbers);
	}
	
	private static void runExampleOne(List<Integer> numbers) {
		List<Integer> processedNumbers = new ArrayList<Integer>(Collections.nCopies(numbers.size(), 0));
		Collections.copy(processedNumbers, numbers);
		
		new NumberOrganizerOne(FilterOption.ONLY_EVEN, OrderOption.ASCENDING).process(processedNumbers);
		
		System.out.println("=== Example One ===");
		System.out.println("Original list: " + numbers);
		System.out.println("Processed list: " + processedNumbers);
	}
	
	private static void runExampleTwo(List<Integer> numbers) {
		List<Integer> processedNumbers = new ArrayList<Integer>(Collections.nCopies(numbers.size(), 0));
		Collections.copy(processedNumbers, numbers);
		
		new NumberOrganizerTwo(new OnlyEvenImpl(), new AscendingImpl()).process(processedNumbers);
		
		System.out.println("=== Example Two ===");
		System.out.println("Original list: " + numbers);
		System.out.println("Processed list: " + processedNumbers);
	}
	
	private static List<Integer> returnRandomList() {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(new Random().nextInt(10));
		}
		return numbers;
	}

}
