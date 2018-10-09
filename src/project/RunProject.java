package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import project.filter.OnlyEvenImpl;
import project.order.AscendingImpl;

public class RunProject {

	public static void main(String[] args) {
		List<Integer> numbers = returnRandomList();
		System.out.println("Original list: " + numbers);
		
		NumberOrganizer ascendingEven = new NumberOrganizer(new OnlyEvenImpl(), new AscendingImpl());
		ascendingEven.process(numbers);
		System.out.println("Processed list: " + numbers);
	}

	
	private static List<Integer> returnRandomList() {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			numbers.add(new Random().nextInt(100));
		}
		return numbers;
	}

}
