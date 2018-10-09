package project.filter;

import java.util.Iterator;
import java.util.List;

public class OnlyEvenImpl implements FilterNumbers {

	public void filter(List<Integer> numbers) {
		Iterator<Integer> iterator = numbers.iterator();
		
		while (iterator.hasNext()) {
			if (iterator.next() % 2 != 0) {
				iterator.remove();
			}
		}
	}

}
