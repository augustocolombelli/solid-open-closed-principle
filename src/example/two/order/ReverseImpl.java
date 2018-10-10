package example.two.order;

import java.util.Collections;
import java.util.List;

public class ReverseImpl implements OrderNumbers {

	public void sort(List<Integer> numbers) {
		Collections.sort(numbers, Collections.reverseOrder());
	}

}
