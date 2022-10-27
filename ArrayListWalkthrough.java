package lab8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWalkthrough {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(23);
		numbers.add(8);
		numbers.add(31);
		numbers.add(45);
		numbers.add(6);
		numbers.add(7);
		numbers.add(19);
		numbers.add(15);
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext())
		{
			int newn=it.next();
			if(10 < newn && newn <20) 
			{
				it.remove();
				System.out.println(newn);
			}
		}
		System.out.println(numbers);
		

	}

}
