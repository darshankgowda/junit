package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
	@BeforeAll  
	static void beforeAll() {
		System.out.println("before all");
	}
	
	@BeforeEach  //for any setup to do before test
	void beforeEach() {
		System.out.println("before each");
	}
	@Test
	void test1() {
		System.out.println("test1");
	}
	@Test
	void test2() {
		System.out.println("test2");
	}
	@Test
	void test3() {
		System.out.println("test3");
	}
	@AfterEach    //any clean to do after each test
	void afterEach() {
		System.out.println("after each");
	}
	@AfterAll  
	static void afterAll() {
		System.out.println("after all");
	}
}
//jUnit will not guarantee in the order of execution of tests(methods)
/*
output:
before all
before each
test1
after each
before each
test2
after each
before each
test3
after each
after all
*/
