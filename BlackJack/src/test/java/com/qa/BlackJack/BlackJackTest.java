package com.qa.BlackJack;

import static org.junit.Assert.*;
import org.junit.Test;

public class BlackJackTest {
	@Test
	public void testGame() {
		BlackJack bj = new BlackJack();
		assertEquals("Both high", 0, bj.play(23, 123));
		assertEquals("First high", 2, bj.play(2, 123));
		assertEquals("Second high", 21, bj.play(23, 21));
		assertEquals("Both under", 19, bj.play(2, 19));
		assertEquals("Both under", 12, bj.play(12, 3));
		assertEquals("Both Same", 21, bj.play(21, 21));
	}

}
