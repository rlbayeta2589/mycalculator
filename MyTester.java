import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	MyCalculator calc = new MyCalculator();
	int arr[] = {1,2,3,4,5}, actual;
	
	@Test
	public void testNfactorial() {
		actual = calc.nfactorial(0);
		assertEquals("0! = 1", actual, 1, 0.0);
		
		actual = calc.nfactorial(-1);
		assertEquals("-1! = 0", actual,0, 0.0);
		
		actual = calc.nfactorial(5);
		assertEquals("5! = 120", actual, 120, 0.0);
	}

	@Test
	public void testBinarySearch() {
		actual = calc.binarySearch(arr, 6);
		assertEquals("search for 6 in [1,2,3,4,5] = -1", actual, -1.0, 0.0);
		
		actual = calc.binarySearch(arr, 3);
		assertEquals("search for 3 in [1,2,3,4,5] = 2", actual, 2.0, 0.0);
		
		actual = calc.binarySearch(arr, 4);
		assertEquals("search for 4 in [1,2,3,4,5] = 3", actual, 3.0, 0.0);
	}

}
