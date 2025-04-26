package unittestpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


//import IntroToUnitTesting.src.main.java.*;

//import org.junit.Test;




public class DemoTest {
	
	@Test
	public void isTriangleTrue1() throws InterruptedException {
		
		assertTrue(Demo.isTriangle(2, 3, 3));
	}
	@Test
	// can test for if argument a is used instead of c
	public void isTriangleTrue2()
	{
		
		assertTrue(Demo.isTriangle(4, 8, 11));
		
	}
	@Test
	// can test for swapping binary operators
	
public void isTriangleTrue3() {
		
		assertTrue(Demo.isTriangle(3, 4, 5));
		
	}
	@Test
public void isTriangleTrue4() {
		
		assertTrue(Demo.isTriangle(1,1,1));
	}
	@Test
	public void isTriangleFalse1() {
			
			assertFalse(Demo.isTriangle(0,0,0));
		}
	@Test
	public void isTriangleFalse2() {
			
			assertFalse(Demo.isTriangle(1,-1,1));
		}
	@Test
	public void isTriangleFalse3() {
			
			assertFalse(Demo.isTriangle(7,8,17));
		}
	
	@Test
	public void isTriangleFalse4() {
			
			assertFalse(Demo.isTriangle(-1,-1,1));
			
		}
	@Test
	public void isTriangleFalse5() {
			
			assertFalse(Demo.isTriangle(0,-1,1));
			
		}
	@Test
	public void isTriangleFalse6() {
			
			assertFalse(Demo.isTriangle(-2,-2,-2));
		}
	
	@Test
	public void isTriangleFalse7() {
		
		assertFalse(Demo.isTriangle(-0.5, 1,0.5));
	}
	@Test
	public void isTriangleFalse8() {
		
		assertFalse(Demo.isTriangle(1,-0.5,0.5));
	}
	@Test
	public void isTriangleFalse9() {
		
		assertFalse(Demo.isTriangle(-0.5,0.5,1));
	}
	@Test
	public void isTriangleFalse10() {
		
		assertFalse(Demo.isTriangle(4,4,8));
	}
	
	@Test
	public void isTriangleTrue5() {
		
		assertTrue(Demo.isTriangle(7,7,7));
	}
	@Test
	public void isTriangleTrue6() {
		assertTrue(Demo.isTriangle(2,1,2));
	}
	@Test
	public void isTriangleTrue7() {
		assertTrue(Demo.isTriangle(50,60,70));
	}
	@Test
	public void isTriangleTrue8() {
		assertTrue(Demo.isTriangle(5,6,7));
	}
	@Test
	public void isTriangleTrue9() {
		assertTrue(Demo.isTriangle(6,5,7));
	}
	@Test
	public void isTriangleTrue10() {
		assertTrue(Demo.isTriangle(7,6,5));
	}
	@Test
	public void isTriangleTrue11() {
		assertTrue(Demo.isTriangle(7,5,6));
	}
	
	@Test
	public void isTriangleFalse11() {
		assertFalse(Demo.isTriangle(50,50,0));
	}
	@Test
	public void isTriangleFalse12() {
		assertFalse(Demo.isTriangle(0,50,50));
	}
	@Test
	public void isTriangleFalse13() {
		assertFalse(Demo.isTriangle(50,0,50));
	}
	@Test
	public void isTriangleFalse14() {
		assertFalse(Demo.isTriangle(50,50,100));
	}
	@Test
	public void isTriangleTrue12() {
		assertTrue(Demo.isTriangle(50,50,50));
	}
	@Test
	public void isTriangleTrue13() {
		assertTrue(Demo.isTriangle(500,600,700));
	}
	@Test
	public void isTriangleFalse15() {
		
		assertFalse(Demo.isTriangle(8,4,4));
	}
	@Test
	public void isTriangleFalse16() {
		
		assertFalse(Demo.isTriangle(4,8,4));
	}
	@Test
	// a-b>c instead a+b>c condition
	public void isTriangleFalse17() {
		
		assertFalse(Demo.isTriangle(8,5,2));
	}
	@Test 
	
	public void isTriangleTrue14() {
		
		assertTrue(Demo.isTriangle(10,5,6));
	}
@Test 
	
	public void isTriangleFalse18() {
		
		assertFalse(Demo.isTriangle(10,100,1000));
	}
@Test
	public void mainTest() {		

		String input = "4\n8\n11\n";
	
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);	
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
				
		String ExpectedOutput = "Enter side 1: "+ System.getProperty("line.separator");

		ExpectedOutput += "Enter side 2: "+ System.getProperty("line.separator");

		ExpectedOutput += "Enter side 3: "+ System.getProperty("line.separator");
		
		ExpectedOutput += "This is a triangle."+ System.getProperty("line.separator");
		
		
		
		assertEquals(ExpectedOutput, out.toString());
		
		

	}

}
