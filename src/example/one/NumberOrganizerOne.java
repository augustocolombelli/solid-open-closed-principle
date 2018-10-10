package example.one;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import example.one.enums.FilterOption;
import example.one.enums.OrderOption;

public class NumberOrganizerOne {
	private FilterOption filterOption;
	private OrderOption orderOption;

	public NumberOrganizerOne(FilterOption filterOption, OrderOption orderOption) {
		this.filterOption = filterOption;
		this.orderOption = orderOption;
	}

	public void process(List<Integer> numbers) {
		if (filterOption == FilterOption.ONLY_EVEN) {
			filterOnlyEven(numbers);
		} else if (filterOption == FilterOption.ONLY_ODD) {
			filterOnlyOdd(numbers);
		}

		if (orderOption == OrderOption.ASCENDING) {
			Collections.sort(numbers);
		} else if (orderOption == OrderOption.REVERSE) {
			Collections.sort(numbers, Collections.reverseOrder());
		}
	}

	private void filterOnlyOdd(List<Integer> numbers) {
		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			if (iterator.next() % 2 == 0) {
				iterator.remove();
			}
		}
	}

	private void filterOnlyEven(List<Integer> numbers) {
		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			if (iterator.next() % 2 != 0) {
				iterator.remove();
			}
		}
	}
}
