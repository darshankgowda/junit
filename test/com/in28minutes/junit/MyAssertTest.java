package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	List<String> list = List.of("joy", "arun", "cornito");
	
	@Test
	void test() {
		boolean test = true;
		assertEquals(true, list.contains("joy"));
		assertTrue(test); //same as above line
		assertEquals(3, list.size());
		assertEquals(2, list.size(), "something went wrong...."); //we can also add a message
		assertFalse(list.contains("GCP"));
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}

}
