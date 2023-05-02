package com.lukai.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test01 {
	
	 @Test
	    public void testReverse() {
	        // Arrange
	        String input = "hello";
	        
	        // Act
	        String result = StringUtils.reverse(input);
	        
	        // Assert
	        assertEquals("字符串不相等", "ollej", result);
	        assertEquals("字符串不相等", "olleh", result);
	    }
}
