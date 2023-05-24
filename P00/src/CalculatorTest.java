import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static  ArrayList<Calculator> calculatorList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		 calculatorList = new ArrayList<Calculator>();
	}
	@Before
	public void setUp() throws Exception {
	}

	

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 5555;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
				int a = 4321;
				int b = 1234;
				
				Calculator cal = new Calculator();
				int actual = cal.subtract(a, b);
				
				int expected = 5555;
				assertEquals(expected,actual);
	}
	public void testMultiple() {
		//fail("Not yet implemented");
				int a = 4321;
				int b = 1234;
				
				Calculator cal = new Calculator();
				int actual = cal.multiple(a, b);
				
				int expected = 5555;
				assertEquals(expected,actual);
	}
	public void testDivide() {
		//fail("Not yet implemented");
				int a = 4321;
				int b = 1234;
				
				Calculator cal = new Calculator();
				int actual = cal.multiple(a, b);
				
				int expected = 5555;
				assertEquals(expected,actual);
	}
	
	@After
	public void tearDown() throws Exception {
		calculatorList.clear();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	calculatorList=null;
	}
}
