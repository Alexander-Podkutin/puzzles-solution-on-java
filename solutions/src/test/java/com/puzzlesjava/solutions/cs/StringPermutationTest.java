package com.puzzlesjava.solutions.cs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author apodkutin
 */
public class StringPermutationTest {

	@Test
	public void isOneStringPermutationOfAnother() throws Exception {
		assertEquals(true,
			StringPermutation.isOneStringPermutationOfAnother("remember", "memberer"));
	}
}