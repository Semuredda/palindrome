package com.writecode.demo.palindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	App app =  new App();
	String input = "noon";
	
	@Test
	public void isPalindromeTest() {
		assertEquals(true, app.isPalindrome(input));
	}
	@Test
	public void isNotPalindromeTest() {
		assertEquals(false, app.isPalindrome("abc"));
	}
	@Test(expected=IllegalArgumentException.class)
	public void isNotPalindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}
}
