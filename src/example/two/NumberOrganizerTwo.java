package example.two;

import java.util.List;

import example.two.filter.FilterNumbers;
import example.two.order.OrderNumbers;

public class NumberOrganizerTwo {
	private FilterNumbers filterNumber;
	private OrderNumbers orderNumber;

	public NumberOrganizerTwo(FilterNumbers filterNumber, OrderNumbers orderNumber) {
		this.filterNumber = filterNumber;
		this.orderNumber = orderNumber;
	}

	public void process(List<Integer> numbers) {
		filterNumber.filter(numbers);
		orderNumber.sort(numbers);
	}
}
