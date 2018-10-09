package project;

import java.util.List;

import project.filter.FilterNumbers;
import project.order.OrderNumbers;

public class NumberOrganizer {
	private FilterNumbers filterNumber;
	private OrderNumbers orderNumber;

	public NumberOrganizer(FilterNumbers filterNumber, OrderNumbers orderNumber) {
		this.filterNumber = filterNumber;
		this.orderNumber = orderNumber;
	}

	public void process(List<Integer> numbers) {
		filterNumber.filter(numbers);
		orderNumber.sort(numbers);
	}
}
