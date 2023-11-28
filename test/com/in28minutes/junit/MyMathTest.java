package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	MyMath math = new MyMath();
	
	@Test
	void calculateSumOfThree() {
		int result = math.calculateSum(new int[] {1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, result); //comparing results
	}
	
	@Test
	void calculateSumOfZero() {
		int result = math.calculateSum(new int[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, result); //comparing results
	}

}
