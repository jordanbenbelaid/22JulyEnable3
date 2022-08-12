package com.qa.blackjack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackjackTest {

	Blackjack play = new Blackjack();
	
	@Test
	public void handOneHandTwoDraw() {
		int a = 15;
		int b = 15;
		
		assertEquals("Draw!", play.playGame(a, b));
	}
}
