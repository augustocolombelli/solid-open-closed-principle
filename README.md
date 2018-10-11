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
We can minimize these problems by creating classes with a single responsibility. In example Two, we created responsible classes to Order and Filter the numbers. The class that applies the rule only execute a method defined on a Interface. Because of this, will rarely need changes, in other words, it's closed for modification.
 
When we need create a new option of Order or Filter, it is necessary to create a new class with this responsibility and implement the Interface defined to use in the centralizing class (NumberOrganizerTwo). That way we have less risk of creating new bugs in others part of application. Moreover, eventual maintenance is more simple and applied in the exact problem context.

```
public interface FilterNumbers {
	void filter(List<Integer> numbers);
}

public class OnlyEvenImpl implements FilterNumbers {

	public void filter(List<Integer> numbers) {
		// some code...
	}
}

public class OnlyOddImpl implements FilterNumbers {

	public void filter(List<Integer> numbers) {
		// some code...
	}
}

```

#### Class Diagram - Example One
![My image](https://github.com/augustocolombelli/solid-open-closed-principle/blob/master/ClassDiagramOne.png)

#### Class Diagram - Example Two
![My image](https://github.com/augustocolombelli/solid-open-closed-principle/blob/master/ClassDiagramTwo.png)


