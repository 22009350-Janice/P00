import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//execute before all test methods of the class are executed
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//execute after all test methods in the current class
	}

	@Before
	public void setUp() throws Exception {
		//execute before each test method
	}

	@After
	public void tearDown() throws Exception {
		//execute after each test method
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual,expected);
	}
	
	@Test
	public void testMultiple() {
		int a = 1000;
		int b = 9;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 9000;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDivide() {
		int a = 9000;
		int b = 9;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 1000;
		assertEquals(expected,actual);
	}
}
