package com.qa.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SharkTest {

	@Test
	public void getterTest() {
		Shark s = new Shark("Fish", 120, "Tiger Shark");
		
		//assertEquals(expected, actual)
		assertEquals("Fish", s.getFood());
		assertEquals(120, s.getWeight());
		assertEquals("Tiger Shark", s.getType());
	}
	
	
}
