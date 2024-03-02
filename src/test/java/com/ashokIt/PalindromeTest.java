package com.ashokIt;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {

	@ParameterizedTest
	@ValueSource(strings = {"racecar" , "liril" , "madam"})
	public void isPalindromeTset(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		boolean actual = pc.isPalindrome(str);
		// boolean expected = true;
		assertTrue(actual);
		// assertEquals(expected, actual);

	}

}
