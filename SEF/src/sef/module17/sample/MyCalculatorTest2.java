package sef.module17.sample;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class MyCalculatorTest2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new MyCalculator();}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
