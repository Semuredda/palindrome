package com.writecode.demo.palindrome;

/**
 * Hello world!
 *
 */
public class App 
{

	public boolean isPalindrome(String input) {
		if(input == null) {
			throw new IllegalArgumentException("Input cannot be null");
		}
		if(input.equals(reverse(input))) {
			return true;
		}else {
			return false;
		}
	}

	public String reverse(String input) {
		String  rev = "";
		for(int i =input.length()-1; i >=0; i--) {
			rev+=input.charAt(i);
		}
		return rev;
	}

	
}
