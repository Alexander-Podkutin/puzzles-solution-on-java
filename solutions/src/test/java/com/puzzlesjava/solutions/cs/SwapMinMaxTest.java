package com.puzzlesjava.solutions.cs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class SwapMinMaxTest {

	@Test
	public void testSwapMinMax() throws Exception {
		int[] array = {2, 6, 4, 9};
		SwapMinMax.swapMinMax(array);
		assertEquals("In old min element index must be 9", 9, array[0]);
		assertEquals("In old max element index must be 2", 2, array[3]);
	}
}