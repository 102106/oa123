package com.lukai.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lukai.pojo.Calculator;

public class CalculatorTest {
	    private Calculator calculator;

	    @Before
	    public void setUp() {
	        calculator = new Calculator();
	    }

	    @After
	    public void tearDown() {
	        calculator = null;
	    }

	    @Test
	    public void testAdd() {
	        int result = calculator.add(2, 3);
	        assertTrue(result == 5);
	    }
	}
	





