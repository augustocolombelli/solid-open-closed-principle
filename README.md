### SOLID - Open Closed Principle (OCP)
Simple example using Open Closed Principle.

#### How can we use this principle?
This principle tell us that our Classes should be open for extension, but closed for modification. 

When we change our code, we have the chance to cause new bugs in other software features. The Open Closed Principle help us to solve this.

Basically, when we have an open class for extension and closed for maintenance, we can increment new rules without changing the existing code.

We have a bad code in example one. Every time that we need to add a new Filter or Order, it is necessary to change the class NumberOrganizerOne,java.
```
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
```


#### Class Diagram



